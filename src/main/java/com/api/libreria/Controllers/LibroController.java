package com.api.libreria.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.libreria.Modelos.Libro;
import com.api.libreria.Services.LibroService;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    private final LibroService servicio;

    public LibroController(LibroService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Libro> listar() {
        return servicio.listar();
    }

    @GetMapping("/{codigo}")
    public Libro consultarLibro(@PathVariable String codigo) {
        return servicio.consultarLibro(codigo);
    }

    @GetMapping("/{codigo}/disponibilidad")
    public Libro consultarDisponibilidad(@PathVariable String codigo) {
        return servicio.consultarDisponibilidad(codigo);
    }
}
