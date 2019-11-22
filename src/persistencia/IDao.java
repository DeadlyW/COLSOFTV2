/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;

/**
 *
 * @author Estudiante
 */
public interface IDao <T>{
    public void registrar(T entidad);
    public void Actualizar(T entidad, String k);
    public void eliminar(Object k);
    public T consultar(String k);
    public List<T> listar();
}
