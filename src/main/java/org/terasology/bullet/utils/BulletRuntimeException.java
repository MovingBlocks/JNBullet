package org.terasology.bullet.utils;

public class BulletRuntimeException extends RuntimeException{
    public BulletRuntimeException (String message) {
        super(message);
    }

    public BulletRuntimeException (Throwable t) {
        super(t);
    }

    public BulletRuntimeException (String message, Throwable t) {
        super(message, t);
    }
}
