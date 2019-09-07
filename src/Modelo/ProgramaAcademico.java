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
public class ProgramaAcademico {

    private int idProgramaAcademico;
    private String nombrePrograma;
    private int idFacultad;
    private String Estado;

    public ProgramaAcademico() {
    }

    public ProgramaAcademico(int idProgramaAcademico, String nombrePrograma, int idFacultad, String Estado) {
        this.idProgramaAcademico = idProgramaAcademico;
        this.nombrePrograma = nombrePrograma;
        this.idFacultad = idFacultad;
        this.Estado = Estado;
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
     * @return the nombrePrograma
     */
    public String getNombrePrograma() {
        return nombrePrograma;
    }

    /**
     * @param nombrePrograma the nombrePrograma to set
     */
    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    /**
     * @return the idFacultad
     */
    public int getIdFacultad() {
        return idFacultad;
    }

    /**
     * @param idFacultad the idFacultad to set
     */
    public void setIdFacultad(int idFacultad) {
        this.idFacultad = idFacultad;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
