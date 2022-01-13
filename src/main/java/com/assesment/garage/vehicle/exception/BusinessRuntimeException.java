package com.assesment.garage.vehicle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author orhany
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BusinessRuntimeException extends RuntimeException{

    public BusinessRuntimeException(String msg) {
        super(msg);
    }
}
