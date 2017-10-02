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
public class ModeloTablaPersona extends AbstractTableModel {

    String[] columnas = {"UserID", "Nombre", "Apellido", "Edad", "Objetivo", "Patologia", "Peso", "Altura", "sexo", "correo","Venc. de Cuota"};
    public List<Persona> personas = new ArrayList<>();

    public ModeloTablaPersona(List<Persona> personas) {
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
                        resp = personas.get(rowIndex).getEdad();

                    } else {
                        if (columnIndex == 4) {
                            resp = personas.get(rowIndex).getObjetivo();

                        } else {
                            if (columnIndex == 5) {
                                resp = personas.get(rowIndex).getPatologia();

                            } else {
                                if (columnIndex == 6) {
                                    resp = personas.get(rowIndex).getPeso();

                                } else {
                                    if (columnIndex == 7) {
                                        resp = personas.get(rowIndex).getAltura();

                                    } else {
                                        if (columnIndex == 8) {
                                            resp = personas.get(rowIndex).getSexo();

                                        } else {
                                            if (columnIndex == 9) {
                                                resp = personas.get(rowIndex).getCorreo();
                                            }else{
                                                if (columnIndex == 10){
                                                resp = personas.get(rowIndex).getDate();
                                                }
                                            }
                                        }
                                    }
                                }

                            }

                        }
                    }

                }
            }
        }
        return resp;
    }

    public Persona DamePersona(int fila) {

        return personas.get(fila);
    }

}
