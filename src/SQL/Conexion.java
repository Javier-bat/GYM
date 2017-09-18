/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba 2013
 */
public class Conexion {

    Connection cn = null;

    public Connection Entrar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databaseName=gym;user=sa; password=admin;");
            JOptionPane.showMessageDialog(null, "Conectado con db");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, hablar con el fabricante " + e);
        }

        return cn;
    }
}
