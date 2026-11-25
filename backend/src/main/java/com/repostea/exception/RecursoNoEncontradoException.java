package com.repostea.exception;

/**
 * Se lanza cuando no existe una gasolinera, alerta, etc. Se devuelve como 404.
 */
public class RecursoNoEncontradoException extends RuntimeException {

    public RecursoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
