/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.ProgramaAcademico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class ManejadorProgramaAcademico implements IDao<ProgramaAcademico> {

    ManejadorBaseDatos mbd = ManejadorBaseDatos.getInstancia();
    PreparedStatement pst = null;
    private List<ProgramaAcademico> listcliente;

    public ManejadorProgramaAcademico() {
        try {
            mbd.conectar();
        } catch (Exception ex) {
            System.out.println("Error al conectar a la bd: " + ex.getMessage());
        }
    }

    @Override
    public void registrar(ProgramaAcademico entidad) {
        try {
            pst = mbd.getConexion().prepareStatement("insert into programaacademico values(?,?,?,?)");
            pst.setString(1, entidad.getIdProgramaAcademico() + "");
            pst.setString(2, entidad.getNombrePrograma());
            pst.setString(3, entidad.getIdFacultad() + "");
            pst.setString(4, entidad.getEstado());

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al registrar: " + ex.getMessage());
        }
    }

    @Override
    public void Actualizar(ProgramaAcademico entidad, String k) {
        try {

//       boolean res = false;
            pst = mbd.getConexion().prepareStatement("Update programaacademico set nombreprograma = ?, idfacultad = ?, estado = ? where idprogramaacademico = ?");

            pst.setString(1, entidad.getNombrePrograma());
            pst.setString(2, entidad.getIdFacultad() + "");
            pst.setString(3, entidad.getEstado());
            pst.setString(4, k);
            int r = pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ManejadorProgramaAcademico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//         return res;
    }

    @Override
    public void eliminar(Object k) {
        try {

            pst = mbd.getConexion().prepareStatement("delete from programaacademico where idprogramaacademico = ?");
            pst.setString(1, k.toString().trim());
            int r = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ManejadorProgramaAcademico.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ManejadorProgramaAcademico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ProgramaAcademico consultar(String k) {
        ResultSet rs = null;
        ProgramaAcademico us1 = null;
        try {
            pst = mbd.getConexion().prepareStatement("select * from programaacademico where idprogramaacademico=?");
            pst.setString(1, k.trim());

            rs = pst.executeQuery();
            while (rs.next()) {
                us1 = ProgramaAcademico.cargar(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return us1;
    }

    @Override
    public List<ProgramaAcademico> listar() {
        ResultSet rs = null;
        PreparedStatement pst = null;
        listcliente = new LinkedList();
        try {
            pst = mbd.getConexion().prepareStatement("select * from programaacademico ");
            rs = pst.executeQuery();
            while (rs.next()) {
                getListcliente().add(ProgramaAcademico.cargar(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorProgramaAcademico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getListcliente();
    }

    /**
     * @return the listcliente
     */
    public List<ProgramaAcademico> getListcliente() {
        return listcliente;
    }

    /**
     * @param listcliente the listcliente to set
     */
    public void setListcliente(List<ProgramaAcademico> listcliente) {
        this.listcliente = listcliente;
    }

}
