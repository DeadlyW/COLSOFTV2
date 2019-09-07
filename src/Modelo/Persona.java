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
public class Persona {

    private int idPersona;
    private String tipoDocumento;
    private String nroDocumento;
    private String apellido;
    private String nombre;
    private String mail;
    private String nroCelular;
    private String nroTelefono;
    private String estado;

    public Persona() {
    }

    public Persona(int idPersona, String tipoDocumento, String nroDocumento, String apellido, String nombre, String mail, String nroCelular, String nroTelefono, String estado) {
        this.idPersona = idPersona;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.mail = mail;
        this.nroCelular = nroCelular;
        this.nroTelefono = nroTelefono;
        this.estado = estado;
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
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the nroDocumento
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * @param nroDocumento the nroDocumento to set
     */
    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the nroCelular
     */
    public String getNroCelular() {
        return nroCelular;
    }

    /**
     * @param nroCelular the nroCelular to set
     */
    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    /**
     * @return the nroTelefono
     */
    public String getNroTelefono() {
        return nroTelefono;
    }

    /**
     * @param nroTelefono the nroTelefono to set
     */
    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
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
