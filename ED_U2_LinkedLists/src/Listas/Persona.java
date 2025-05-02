/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author USUARIO
 */
public class Persona implements Comparable<Persona> {
    
    private int promedio;
    private String nombre;

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {
        
        if(getPromedio()>o.getPromedio())
            return 1;
        else if(getPromedio()<o.getPromedio())
            return -1;
        
        return 0;
    }
    
}
