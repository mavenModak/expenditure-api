package com.mavenmodak.moneytracker.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MtBadRequestException extends RuntimeException {

    public MtBadRequestException(String message){
        super(message);
    }
}
