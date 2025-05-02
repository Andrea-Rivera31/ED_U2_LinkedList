/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class TestColaAtencion {
    
    public static void main(String[] args) throws Exception {
        ColaAtencionCliente cola = new ColaAtencionCliente();

        // Agregamos 10 clientes, algunos prioritarios
        cola.agregarCliente(new Cliente2(1, false));
        cola.agregarCliente(new Cliente2(2, true));
        cola.agregarCliente(new Cliente2(3, false));
        cola.agregarCliente(new Cliente2(4, true));
        cola.agregarCliente(new Cliente2(5, true));
        cola.agregarCliente(new Cliente2(6, false));
        cola.agregarCliente(new Cliente2(7, false));

        System.out.println("\n--- Estado inicial de la cola ---");
        cola.mostrarCola();

        // Atendemos 3 clientes
        System.out.println("\n--- Atendiendo clientes ---");
        System.out.println("Cliente atendido: " + cola.atenderCliente());
        System.out.println("Cliente atendido: " + cola.atenderCliente());
        System.out.println("Cliente atendido: " + cola.atenderCliente());

        System.out.println("\n--- Estado final de la cola ---");
        cola.mostrarCola();
    }
}
