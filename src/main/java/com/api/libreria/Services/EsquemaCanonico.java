package com.api.libreria.Services;

import java.util.Locale;

public class EsquemaCanonico {

    private EsquemaCanonico() {
    }

    public static String matricula(String valor) {
        if (valor == null) {
            throw new IllegalArgumentException("La matrícula no puede ser nula");
        }

        return valor.trim().toUpperCase(Locale.ROOT);
    }

    public static String codigoLibro(String valor) {
        if (valor == null) {
            throw new IllegalArgumentException("El código del libro no puede ser nulo");
        }

        return valor.trim().toUpperCase(Locale.ROOT);
    }
}
