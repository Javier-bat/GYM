/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTabla;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author toshiba 2013
 */
public class ModeloTablaCorreo extends AbstractTableModel {

    String[] columnas = {"UserID", "Nombre", "Apellido","correo"};
    public List<Persona> personas = new ArrayList<>();

    public ModeloTablaCorreo(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];

    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resp = null;
        if (columnIndex == 0) {
            resp = personas.get(rowIndex).getUserid();
        } else {
            if (columnIndex == 1) {
                resp = personas.get(rowIndex).getNombre();
            } else {
                if (columnIndex == 2) {
                    resp = personas.get(rowIndex).getApellido();

                } else {
                    if (columnIndex == 3) {
                        resp = personas.get(rowIndex).getCorreo();

                    } 
        
    }}}return resp;}

    public Persona DamePersona(int fila) {
        
    return personas.get(fila);
    }

}
