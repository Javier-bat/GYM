/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author toshiba 2013
 */
public class Persona {


    
    public int userid;    
    public String nombre;    
    public String apellido;   
    public int edad;    
    public String objetivo;   
    public String patologia;    
    public int peso;   
    public int altura;    
    public String sexo;
    public String correo;
    public Date date;

  


    public Persona() {
    }

    public Persona(int userid, String nombre, String apellido, int edad, String objetivo, String patologia, int peso, int altura, String sexo, String correo, Date date) {
        this.userid = userid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.objetivo = objetivo;
        this.patologia = patologia;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.correo = correo;
        this.date = date;
    }
    
    
    
    
        public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
      public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }


    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    
}
