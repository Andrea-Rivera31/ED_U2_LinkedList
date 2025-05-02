/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class Cliente2 {
    
    int id;
    boolean esPrioritario;
    
    public Cliente2(int id, boolean esPrioritario){
        this.id = id;
        this.esPrioritario = esPrioritario;
    }
    
    @Override
    public String toString() {
        return "Cliente{id=" + id + ", prioritario=" + esPrioritario + "}";
    }
    
}
