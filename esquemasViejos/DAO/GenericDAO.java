/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author usuario
 */
public interface GenericDAO <T,PK extends Serializable> {
    
  void Guardar(Entity t);
  void Actualizar(Entity t);
  Entity Buscar(PK id);
  void Eliminar(Entity t);
}
