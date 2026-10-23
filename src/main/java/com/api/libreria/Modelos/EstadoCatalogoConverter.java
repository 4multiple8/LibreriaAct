package com.api.libreria.Modelos;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class EstadoCatalogoConverter implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean disponible) {
        if (disponible == null) {
            return null;
        }

        return disponible ? "1" : "0";
    }

    @Override
    public Boolean convertToEntityAttribute(String valor) {
        if (valor == null) {
            return null;
        }

        return "1".equals(valor);
    }
}
