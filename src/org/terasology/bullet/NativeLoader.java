
package org.terasology.bullet;

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
public final class NativeLoader {
	// -- Static
	private static final NativeLoader INSTANCE = new NativeLoader();

	// -- State
	private Loader loader = new DefaultLoader();

	/**
	 * Returns the instance.
	 * 
	 * @return the instance
	 */
	public static NativeLoader getInstance() {
		return INSTANCE;
	}

	// -- Construction
	/**
	 * Private constructor to prevent external instantiation.
	 */
	private NativeLoader() {
	}

	// -- Properties
	/**
	 * Return the native library loader.
	 * 
	 * @return the loader
	 */
	public Loader getLoader() {
		return loader;
	}

	/**
	 * Sets the native library loader.
	 * 
	 * @param loader
	 *            the loader
	 */
	public void setLoader(Loader loader) {
		if (loader == null) {
			throw new NullPointerException("loader must not be null");
		}
		this.loader = loader;
	}

	// -- Member types
	/**
	 * Loads the library.
	 */
	public interface Loader {
		public void load();
	}

	private class DefaultLoader implements Loader {
		@Override
		public void load() {
			// Generate library name.
			StringBuilder builder = new StringBuilder("bullet-");


			if (System.getProperty("os.name").toLowerCase().contains("win")) {
				// Windows
				builder.append("windows-");
			} else {
				// Assume Linux
				builder.append("linux-");
			}

			if (System.getProperty("os.arch").endsWith("64")) {
				// Assume x86_64
				builder.append("amd64");
			} else {
				// Assume x86_32
				builder.append("i686");
			}

			System.loadLibrary(builder.toString());
		}
	}
}