/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    
    private String Cliente;
    private String producto;

    public Pedido(String Cliente, String producto) {
        this.Cliente = Cliente;
        this.producto = producto;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getProducto() {
        return producto;
    }
    
    @Override
    public String toString() {
        return "Pedido de " + Cliente + " - Producto: " + producto;
    }
    
}
