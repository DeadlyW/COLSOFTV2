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
public class Jornada {

    private int idJornada;
    private String nombre;
    private String estado;

    public Jornada() {
    }

    public Jornada(int idJornada, String nombre, String estado) {
        this.idJornada = idJornada;
        this.nombre = nombre;
        this.estado = estado;
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
