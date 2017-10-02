/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author toshiba 2013
 */
public class RowsRenderer extends DefaultTableCellRenderer {
    private int columna;
    
    public RowsRenderer(int Colpatron){
        
        this.columna = Colpatron;}
    
    public Component getTableCellRendererComponent(JTable table, Object value,boolean selected ,boolean focused, int row, int column)
    {
        setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        if(table.getValueAt(row, column))
    }
    
    
}
