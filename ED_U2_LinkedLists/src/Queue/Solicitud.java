/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class Solicitud {
    
    String codigoCliente;
    String categoria; // "urgente" o "normal"

    public Solicitud(String codigoCliente, String categoria) {
        this.codigoCliente = codigoCliente;
        this.categoria = categoria;
    }
    
    public boolean esUrgente() {
        return categoria.equals("urgente");
    }

    @Override
    public String toString() {
        return codigoCliente + " (" + categoria + ")";
    }
}
