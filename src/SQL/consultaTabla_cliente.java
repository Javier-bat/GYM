/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba 2013
 */
public class consultaTabla_cliente{
    void consulta(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
			"databaseName=gym;user=sa; password=admin;");
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select usuario,contraseña from usuario");
            String datos[] = new String[2];
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2); 
                System.out.println(datos[0]+datos[1]); 

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(consultaTabla_cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(consultaTabla_cliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR "+ex);
        }
    }
    
    

 
    public static void main(String[] args){
    consultaTabla_cliente objcon = new consultaTabla_cliente();
    objcon.consulta();
    
    }
            


}




