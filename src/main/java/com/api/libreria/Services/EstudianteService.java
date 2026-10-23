package com.api.libreria.Services;

import com.api.libreria.Modelos.Estudiante;
import com.api.libreria.Repositories.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repositorio;

    public EstudianteService(EstudianteRepository repositorio) {
        this.repositorio = repositorio;
    }

    public List<Estudiante> listar() {
        return repositorio.findAll();
    }

    public Estudiante consultarEstudiante(String matricula) {
        String canonica = EsquemaCanonico.matricula(matricula);
        return repositorio.findById(canonica)
                .orElseThrow(() -> new ServicioException(CodigoError.ESTUDIANTE_NO_ENCONTRADO));
    }
}
