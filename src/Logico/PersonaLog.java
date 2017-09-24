/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import DAO.PersonaDao;
import Entidades.Persona;

import java.util.List;


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
           public List<Persona> correo(){
             return personas.correo();
           }
           
          
            
}
