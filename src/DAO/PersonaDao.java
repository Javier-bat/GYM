/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Persona;
import SQL.Conexion;
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
public class PersonaDao {
    Conexion conexion= new Conexion();

    public boolean UpdatePersona(Persona per){
        
        Connection con = null;
        CallableStatement cstm = null;
        boolean resp=true;
        try {
            con = conexion.Entrar();
            cstm=con.prepareCall("{call UpdatePersona(?,?,?,?,?,?,?,?,?)}");
            cstm.setString(1, per.getNombre());
            cstm.setString(2, per.getApellido());
            cstm.setInt(3, per.getEdad());
            cstm.setString(4, per.getObjetivo());
            cstm.setString(5, per.getPatologia());
            cstm.setInt(6, per.getPeso());
            cstm.setInt(7, per.getAltura());
            cstm.setString(8, per.getSexo());
            cstm.setInt(9, per.getUserid());
            resp=cstm.execute();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        
        return resp;
        
    }
            
     public boolean Inactivo(Persona per){
         Connection con=null;
         CallableStatement cstm=null;
         boolean resp=true;
         try {
             con = conexion.Entrar();
             cstm=con.prepareCall("{Call DeletePersona(?)}");
             cstm.setInt(1, per.getUserid());
             resp=cstm.execute();
            
            
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error "+e);
         }
     
     return resp;
     
     }      
     
          public boolean Reintegro(Persona per){
         Connection con=null;
         CallableStatement cstm=null;
         boolean resp=true;
         try {
             con = conexion.Entrar();
             cstm=con.prepareCall("{Call Reintegro(?)}");
             cstm.setInt(1, per.getUserid());
             resp=cstm.execute();
            
            
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error "+e);
         }
     
     return resp;
     
     }     
          
          public List<Persona> listado(){
              Connection con = null;
              CallableStatement cstm=null;
              ResultSet rs =null;
              List<Persona> lista = null;
              try {
                  lista=new ArrayList<>();
                  con=conexion.Entrar();
                  cstm=con.prepareCall("{Call Listar}");
                  rs = cstm.executeQuery();
                  Persona per = null;
                  while (rs.next()){
                     per = new Persona();
                     per.setUserid(rs.getInt("UserID"));
                     per.setNombre(rs.getString("Nombre"));  
                     per.setApellido(rs.getString("Apellido"));
                     per.setEdad(rs.getInt("Edad"));
                     per.setObjetivo(rs.getString("Objetivo"));
                     per.setPatologia(rs.getString("Patologia"));
                     per.setPeso(rs.getInt("Peso"));
                     per.setAltura(rs.getInt("Talla"));
                     per.setSexo(rs.getString("Sexo"));
                     lista.add(per);
                  
                  
                  }
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "ERROR "+e);
              }
              return lista;
          }
          
           public List<Persona> listadoInactivos(){
              Connection con = null;
              CallableStatement cstm=null;
              ResultSet rs =null;
              List<Persona> lista = null;
              try {
                  lista=new ArrayList<>();
                  con=conexion.Entrar();
                  cstm=con.prepareCall("{Call Inactivo}");
                  rs = cstm.executeQuery();
                  Persona per = null;
                  while (rs.next()){
                     per = new Persona();
                     per.setUserid(rs.getInt("UserID"));
                     per.setNombre(rs.getString("Nombre"));  
                     per.setApellido(rs.getString("Apellido"));
                     per.setEdad(rs.getInt("Edad"));
                     per.setObjetivo(rs.getString("Objetivo"));
                     per.setPatologia(rs.getString("Patologia"));
                     per.setPeso(rs.getInt("Peso"));
                     per.setAltura(rs.getInt("Talla"));
                     per.setSexo(rs.getString("Sexo"));
                     lista.add(per);
                  
                  
                  }
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "ERROR "+e);
              }
              return lista;
          }     
                      public List<Persona> correo(){
              Connection con = null;
              CallableStatement cstm=null;
              ResultSet rs =null;
              List<Persona> lista = null;
              try {
                  lista=new ArrayList<>();
                  con=conexion.Entrar();
                  cstm=con.prepareCall("{Call correo}");
                  rs = cstm.executeQuery();
                  Persona per = null;
                  while (rs.next()){
                     per = new Persona();
                     per.setUserid(rs.getInt("UserID"));
                     per.setNombre(rs.getString("Nombre"));  
                     per.setApellido(rs.getString("Apellido"));
                     per.setCorreo(rs.getString("Correo"));
                     lista.add(per);
                  
                  
                  }
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "ERROR "+e);
              }
              return lista;
          }         
          
            
}
