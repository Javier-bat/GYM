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
            ResultSet rs=st.executeQuery("select * from cliente");
            String datos[] = new String[9];
            System.out.println("UserID  nombre  apellido       edad    objetivo    patologia   peso    talla   sexo");
            while(rs.next()){
                for (int i = 0; i < 9; i++) {
                datos[0]=rs.getString(i+1);
                System.out.print(datos[0]+"\t");    
                }
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(consultaTabla_cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(consultaTabla_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

 
    public static void main(String[] args){
    consultaTabla_cliente objcon = new consultaTabla_cliente();
    objcon.consulta();
    
    }
            


}




