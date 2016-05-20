/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionaria;

/**
 *
 * @author Usuario
 */
public class Empleado {
    String Nombre; 
    int edad; 

    public Empleado() {
    }

    public Empleado(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
