package com.learn.exceptions;

/**
 * Created by akash.sharma on 22/08/17.
 */
public class BadRequestException extends RuntimeException {
    String message;

    public BadRequestException (String message){
        super(message);
        this.message = message;
    }
}
