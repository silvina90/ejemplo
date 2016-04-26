/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author usuario
 */
public interface GenericDAO <T extends Serializable> {
    
  void Guardar(T t);
  void Actualizar(T t);
  List <T> Buscar();
  List <T> BuscarPersona(String t);
  void Eliminar(int t);
}
