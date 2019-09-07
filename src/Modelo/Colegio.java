/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Colegio {
    
    private int idColegio;
    private String nombre;
    private String direccion;
    private String distrito;
    private String departamento;

    public Colegio() {
    }

    public Colegio(int idColegio, String nombre, String direccion, String distrito, String departamento) {
        this.idColegio = idColegio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.distrito = distrito;
        this.departamento = departamento;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the distrito
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * @param distrito the distrito to set
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
