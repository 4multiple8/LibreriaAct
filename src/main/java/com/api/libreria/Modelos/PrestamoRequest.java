package com.api.libreria.Modelos;

public class PrestamoRequest {
    private String matriculaEstudiante;
    private String codigoLibro;

    public PrestamoRequest() {}

    public PrestamoRequest(String matriculaEstudiante, String codigoLibro) {
        this.matriculaEstudiante = matriculaEstudiante;
        this.codigoLibro = codigoLibro;
    }

    public String getMatriculaEstudiante() { return matriculaEstudiante; }
    public void setMatriculaEstudiante(String matriculaEstudiante) { this.matriculaEstudiante = matriculaEstudiante; }

    public String getCodigoLibro() { return codigoLibro; }
    public void setCodigoLibro(String codigoLibro) { this.codigoLibro = codigoLibro; }
}