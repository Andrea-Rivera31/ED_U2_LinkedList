/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class TestColaPedidos {

    public static void main(String[] args) throws Exception {
        ColaPedidos cola = new ColaPedidos();

        cola.agregarPedido(new Pedido("Ana", "Café latte"));
        cola.agregarPedido(new Pedido("Luis", "Té verde"));
        cola.agregarPedido(new Pedido("Carla", "Capuccino"));

        System.out.println("\n--- Pedidos en cola ---");
        cola.mostrarCola();

        System.out.println("\n--- Atendiendo pedido ---");
        Pedido atendido = cola.atenderPedido();
        if (atendido != null) {
            System.out.println("Atendido: " + atendido);
        }

        System.out.println("\n--- Pedidos restantes ---");
        cola.mostrarCola();
    }
}
