package com.coder2client.exception;

public class UnauthorizedAccessException extends RuntimeException{

    public UnauthorizedAccessException(String message){
        super(message);
    }
}
