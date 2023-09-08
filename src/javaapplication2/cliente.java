/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author vina
 */
public class cliente {
    
    public int telefono;
    public String nombre;
    public char sexo;
    public int rut;
    public int edad;
    private vehiculo vehiculo1;
    
    
    public cliente(){
        
    }

    public cliente(int telefono, String nombre, char sexo, int rut, int edad) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.sexo = sexo;
        this.rut = rut;
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "cliente{" + "telefono=" + telefono + ", nombre=" + nombre + ", sexo=" + sexo + ", rut=" + rut + ", edad=" + edad + ", vehiculo1=" + vehiculo1 + '}';
    }

    
}
