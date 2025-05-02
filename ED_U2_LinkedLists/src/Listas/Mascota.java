/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Mascota implements Comparable<Mascota>{
    
    private String id;
    private String nombre;
    private int edad;

    public Mascota(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Mascota() {
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    @Override
    public int compareTo(Mascota o) {
        int resultado = 0;
        
        if(this.getEdad() > o.getEdad()){
            resultado = 1;
        }else if(this.getEdad() < o.getEdad()){
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Mascota{" + "edad=" + edad + '}';
    }


    @Override
    public boolean equals(Object obj) {
        Mascota mO = (Mascota)obj;
        
        if(getNombre().equals(mO.getNombre()) &&
                getId().equals(mO.getId()))
            return true;
        
        return false;
    }
}
