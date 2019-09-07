/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Deadly
 */
public class Preinscripcion {

    private int idPreinscripcion;
    private int idNivelFormacion;
    private int idProgramaAcademico;
    private int idPersona;
    private String fechaRegistro;
    private int idColegio;
    private int idJornada;
    private String estado;

    public Preinscripcion() {
    }

    public Preinscripcion(int idPreinscripcion, int idNivelFormacion, int idProgramaAcademico, int idPersona, String fechaRegistro, int idColegio, int idJornada, String estado) {
        this.idPreinscripcion = idPreinscripcion;
        this.idNivelFormacion = idNivelFormacion;
        this.idProgramaAcademico = idProgramaAcademico;
        this.idPersona = idPersona;
        this.fechaRegistro = fechaRegistro;
        this.idColegio = idColegio;
        this.idJornada = idJornada;
        this.estado = estado;
    }

    /**
     * @return the idPreinscripcion
     */
    public int getIdPreinscripcion() {
        return idPreinscripcion;
    }

    /**
     * @param idPreinscripcion the idPreinscripcion to set
     */
    public void setIdPreinscripcion(int idPreinscripcion) {
        this.idPreinscripcion = idPreinscripcion;
    }

    /**
     * @return the idNivelFormacion
     */
    public int getIdNivelFormacion() {
        return idNivelFormacion;
    }

    /**
     * @param idNivelFormacion the idNivelFormacion to set
     */
    public void setIdNivelFormacion(int idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
    }

    /**
     * @return the idProgramaAcademico
     */
    public int getIdProgramaAcademico() {
        return idProgramaAcademico;
    }

    /**
     * @param idProgramaAcademico the idProgramaAcademico to set
     */
    public void setIdProgramaAcademico(int idProgramaAcademico) {
        this.idProgramaAcademico = idProgramaAcademico;
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the fechaRegistro
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the idColegio
     */
    public int getIdColegio() {
        return idColegio;
    }

    /**
     * @param idColegio the idColegio to set
     */
    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    /**
     * @return the idJornada
     */
    public int getIdJornada() {
        return idJornada;
    }

    /**
     * @param idJornada the idJornada to set
     */
    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
