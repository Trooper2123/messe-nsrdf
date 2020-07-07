package com.rosario_lagosul.messe.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Registro não identificado .Id " + id);
    }

    public ResourceNotFoundException(String name){
        super("Registro não identificado .Nome "+ name);
    }
}
