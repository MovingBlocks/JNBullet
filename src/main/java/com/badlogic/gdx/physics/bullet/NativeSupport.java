/*
 * Copyright (C) 2008,2012 Andre Naef
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.badlogic.gdx.physics.bullet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.Configuration;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

/**
 * Loads the JNLua native library.
 *
 * The class provides and configures a default loader implementation that loads
 * the JNLua native library by means of the <code>System.loadLibrary</code>
 * method. In some situations, you may want to override this behavior. For
 * example, when using JNLua as an OSGi bundle, the native library is loaded by
 * the OSGi runtime. Therefore, the OSGi bundle activator replaces the loader by
 * a no-op implementaion. Note that the loader must be configured before
 * LuaState is accessed.
 */
public final class NativeSupport {
    private static final Logger logger = LoggerFactory.getLogger(NativeSupport.class);

    static final String JAVA_LIBRARY_PATH = "java.library.path";
    static final String CONFIG_PATH = "org.terasology.librarypath";

    static boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
    static boolean isMacOS =  System.getProperty("os.name").toLowerCase().contains("mac");
    static boolean is64 = System.getProperty("os.arch").endsWith("64");
    static boolean isArm = System.getProperty("os.arch").endsWith("aarch64");

    private static final Pattern PATH_SEPARATOR = Pattern.compile(File.pathSeparator);


    // -- Construction

    /**
     * Private constructor to prevent external instantiation.
     */
    private NativeSupport() {
    }

    public static void load(String name) {
        logger.info("Loading JNBullet Library:" + name);

        String target = name + "-";
        if (isWindows) {
            // Windows
            target += "windows-";
        } else if (isMacOS) {
            // osx
            target += "darwin-";
        } else {
            // Assume Linux
            target += "linux-";
        }

        if (isArm) {
            target += "aarch64";
        } else if (is64) {
            // Assume x86_64
            target += "amd64";
        } else {
            // Assume x86_32
            target += "i686";
        }

        String file = "";
        if (isWindows) {
            file = "lib" + target + ".dll";
        } else if (isMacOS) {
            file = "lib" + target + ".dylib";
        } else {
            file = "lib" + target + ".so";
        }

        String assembly = isWindows ? "lib" + target : target;

        if (Paths.get(name).isAbsolute()) {
            System.load(name);
            logger.info("Success");
            return;
        }

        // METHOD 2: org.terasology.librarypath


        String configPath = System.getProperty(CONFIG_PATH);
        if (configPath != null && !configPath.isEmpty()) {
            Path libFile = findFile(configPath, file);
            if (libFile == null) {
                logger.info(assembly + " not found in " + configPath + "/" + file);
            } else {
                System.load(libFile.toAbsolutePath().toString());
                logger.info(String.format("\tLoaded from %s: %s", JAVA_LIBRARY_PATH, libFile));
                return;
            }
        }

        String javaLibraryPath = System.getProperty(JAVA_LIBRARY_PATH);
        if(javaLibraryPath != null) {
            Path libFile = findFile(javaLibraryPath, file);
            if (libFile == null) {
                logger.info(assembly + " not found in " + javaLibraryPath + "=" + file);
            } else {
                System.load(libFile.toAbsolutePath().toString());
                logger.info(String.format("\tLoaded from %s: %s", JAVA_LIBRARY_PATH, libFile));
                return;
            }
        }


        // load from java.library.path
        try {
            System.loadLibrary(assembly);
            Path p = javaLibraryPath == null ? null : findFile(javaLibraryPath, file);
            if (p != null) {
                logger.info("Loaded from " + JAVA_LIBRARY_PATH + " : " + p);
                return;
            } else {
                logger.info("Loaded from a ClassLoader provided path.");
            }
        } catch (Throwable t){
            logger.error("Failed to locate library: " + assembly);
        }
    }

    private static Path findFile(String path, String file) {
        for(String directory: PATH_SEPARATOR.split(path)) {
            Path p = Paths.get(directory,file);
            if(Files.isReadable(p)){
                return p;
            }
        }
        return null;
    }



}
