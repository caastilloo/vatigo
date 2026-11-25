package com.vatigo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Convierte las excepciones en respuestas JSON con el código HTTP adecuado.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecursoNoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public java.util.Map<String, String> noEncontrado(RecursoNoEncontradoException e) {
        return java.util.Map.of("error", e.getMessage());
    }
}
