/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import DAO.PersonaDao;
import Entidades.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba 2013
 */
public class PersonaLog {
    PersonaDao personas= new PersonaDao();

    public boolean UpdatePersona(Persona per){
  return personas.UpdatePersona(per);
        
    }
            
     public boolean Inactivo(Persona per){
        return personas.Inactivo(per);
     
     }      
     
          public boolean Reintegro(Persona per){
      return personas.Reintegro(per);
     
     }     
          
          public List<Persona> listado(){
             return personas.listado();
          }
          
           public List<Persona> listadoInactivos(){
             return personas.listadoInactivos();
          }         
          
            
}
