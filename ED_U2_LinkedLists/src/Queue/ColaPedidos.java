/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import Listas.LinkedList;

/**
 *
 * @author USUARIO
 */
public class ColaPedidos {
    private Queue<Pedido> cola;
    
    public ColaPedidos() {
        this.cola = new Queue<>(new LinkedList<>(), 100); // max 100 pedidos
    }
    
    public void agregarPedido(Pedido p){
        cola.push(p);
    }

    public Pedido atenderPedido(){
        if (cola.isEmpty()) {
            System.out.println("No hay pedidos para atender.");
            return null;
        }
        return cola.pop();
    }

    public void mostrarCola(){
        Queue<Pedido> temp = new Queue<>(new LinkedList<>(), 100);
        System.out.println("Pedidos en espera:");
        while (!cola.isEmpty()) {
            Pedido p = cola.pop();
            System.out.println(p);
            temp.push(p);
        }
        while (!temp.isEmpty()) {
            cola.push(temp.pop());
        }
    }
    
}
