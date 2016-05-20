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
public class PERSONA {
    public  String Nombre;
    public String Apellido;
    public String CI;

    public PERSONA() {
    }

    public PERSONA(String Nombre, String Apellido, String CI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }
    
}
