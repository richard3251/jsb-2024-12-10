package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "엔티티 찾을 수없음 용가리")
public class DataNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }

}
