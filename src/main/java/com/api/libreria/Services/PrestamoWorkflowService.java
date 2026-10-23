package com.api.libreria.Services;

import com.api.libreria.Modelos.Estudiante;
import com.api.libreria.Modelos.Libro;
import com.api.libreria.Modelos.PrestamoRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PrestamoWorkflowService {

    private final EstudianteService estudianteService;
    private final LibroService libroService;

    public PrestamoWorkflowService(EstudianteService estudianteService, LibroService libroService) {
        this.estudianteService = estudianteService;
        this.libroService = libroService;
    }

    @Transactional
    public String procesarPrestamoLibro(PrestamoRequest request) {
        Estudiante estudiante = estudianteService.consultarEstudiante(request.getMatriculaEstudiante());
        if (!estudiante.isActivo()) {
            throw new RuntimeException("El estudiante no se encuentra activo.");
        }

        Libro libro = libroService.consultarLibro(request.getCodigoLibro());
        if (!Boolean.TRUE.equals(libro.getDisponible())) {
            throw new RuntimeException("El libro no se encuentra disponible.");
        }

        libroService.marcarPrestado(libro.getCodigo());

        return "Préstamo registrado exitosamente para el estudiante: " + estudiante.getNombre() + 
               " con el libro: " + libro.getTitulo();
    }
}