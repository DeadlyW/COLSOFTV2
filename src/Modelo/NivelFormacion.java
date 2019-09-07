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
public class NivelFormacion {

    private int idNivelFormacion;
    private String nombre;
    private String estado;

    public NivelFormacion() {
    }

    public NivelFormacion(int idNivelFormacion, String nombre, String estado) {
        this.idNivelFormacion = idNivelFormacion;
        this.nombre = nombre;
        this.estado = estado;
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
