/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;


import Modelo.Facultad;
import Modelo.Preinscripcion;
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
public class ManejadorFacultad implements IDao<Facultad> {

    ManejadorBaseDatos mbd = ManejadorBaseDatos.getInstancia();
    PreparedStatement pst = null;

    public ManejadorFacultad() {
        try {
            mbd.conectar();
        } catch (Exception ex) {
            System.out.println("Error al conectar a la bd: " + ex.getMessage());
        }
    }
    
    @Override
    public void registrar(Facultad entidad) {
        try {
            pst = mbd.getConexion().prepareStatement("insert into facultad values(?,?,?)");
            pst.setString(1, entidad.getIdFacultad()+"");
            pst.setString(2, entidad.getNombre());
            pst.setString(3, entidad.getEstado());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al registrar: " + ex.getMessage());
        }
    }

   @Override
    public void Actualizar(Facultad entidad, String k) {
        try {
            
//       boolean res = false;
            pst = mbd.getConexion().prepareStatement("Update facultad where set idfacultad = ?");
            pst.setString(1, entidad.getIdFacultad()+"");
            pst.setString(2, entidad.getNombre());
            pst.setString(3, entidad.getEstado());
            int r = pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ManejadorFacultad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//         return res;
    }

   @Override
    public void eliminar(Object k) {
        try {
            
            pst = mbd.getConexion().prepareStatement("delete * from facultad where idfacultad = ?");
            pst.setString(1, k.toString().trim());
            int r = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ManejadorFacultad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ManejadorFacultad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public Facultad consultar(String k,String j) {
        ResultSet rs = null;
        Facultad us1 = null;
        try {
            pst = mbd.getConexion().prepareStatement("select * from facultad where idfacultad=? and nombre=? and estado=?");
            pst.setString(1, k.trim());
            pst.setString(2, j.trim());
            rs = pst.executeQuery();
            while (rs.next()) {
                us1 = Facultad.cargar(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return us1;
    }

   @Override
    public List<Facultad> listar() {
        ResultSet rs = null;
        PreparedStatement pst = null;
        List<Facultad> listcliente = new LinkedList();
        try {
            pst = mbd.getConexion().prepareStatement("select * from facultad ");
            rs = pst.executeQuery();
            while (rs.next()) {
                listcliente.add(Facultad.cargar(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorFacultad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listcliente;
    }
}
