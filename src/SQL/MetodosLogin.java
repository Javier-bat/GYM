/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import ventanas.interfaz;
import SQL.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author toshiba 2013
 */
public class MetodosLogin {
    Conexion con = new Conexion();
    public int validar_ingreso(){
        String usuario=interfaz.jTextFieldUser.getText();
        String clave=String.valueOf(interfaz.jPasswordField1.getPassword());
        int resultado=0;
        
        String SSQL="select * from usuario where usuario='"+usuario+"'and contraseña='"+clave+"'";
        
        Connection conect=null;
        try {
            
           conect = con.Entrar();
           
           Statement st=conect.createStatement();
           
            ResultSet rs=st.executeQuery(SSQL);
            if (rs.next()) {
                resultado=1;
            }
            
        } catch (Exception e) {
        }
        return resultado;
    }
}
