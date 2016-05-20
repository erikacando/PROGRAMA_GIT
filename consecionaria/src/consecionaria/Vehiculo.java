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
public class Vehiculo 
{
    public String marca;
    public String modelo;
    public int anio;
    public int precio;

    public Vehiculo() 
    {
    }

    public Vehiculo(String marca, String modelo, int anio, int precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModelo() 
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getAnio()
    {
        return anio;
    }
    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public int getPrecio() 
    {
        return precio;
    }
    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }
    
    public String Acelerar()
    {
        String variable ="Vehiculo Acelera";
        return variable;
    }   
    
}
