package com.api.libreria.Controllers;

import com.api.libreria.Modelos.PrestamoRequest;
import com.api.libreria.Services.PrestamoWorkflowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoController {

    private final PrestamoWorkflowService prestamoWorkflowService;

    public PrestamoController(PrestamoWorkflowService prestamoWorkflowService) {
        this.prestamoWorkflowService = prestamoWorkflowService;
    }

    @PostMapping
    public ResponseEntity<String> registrarPrestamo(@RequestBody PrestamoRequest request) {
        String resultado = prestamoWorkflowService.procesarPrestamoLibro(request);
        return ResponseEntity.ok(resultado);
    }
}