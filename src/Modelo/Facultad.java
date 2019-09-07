/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Deadly
 */
public class Facultad {

    private int idFacultad;
    private String nombre;
    private String estado;

    public Facultad() {
    }

    public Facultad(int idFacultad, String nombre, String estado) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        this.estado = estado;
    }

    public static Facultad cargar(ResultSet rs) throws SQLException {
        Facultad us = new Facultad();
        us.setIdFacultad(Integer.parseInt(rs.getString(1)));
        us.setNombre(rs.getString(2));
        us.setEstado(rs.getString(3));

        return us;

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
