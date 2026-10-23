package com.api.libreria.Services;

public class ServicioException extends RuntimeException {

    private final CodigoError codigoError;

    public ServicioException(CodigoError codigoError) {
        super(codigoError.name());
        this.codigoError = codigoError;
    }

    public ServicioException(CodigoError codigoError, String mensaje) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    public CodigoError getCodigoError() {
        return codigoError;
    }
}
