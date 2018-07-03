package com.yhyecho.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by Echo on 7/3/18.
 */
public class UsernameIsExitedException extends AuthenticationException {

    public UsernameIsExitedException(String msg) {
        super(msg);
    }

    public UsernameIsExitedException(String msg, Throwable t) {
        super(msg, t);
    }
}