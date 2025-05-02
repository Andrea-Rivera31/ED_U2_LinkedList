/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class SimuladorSupermercado {

    private Queue<Cliente1> carritos = new Queue<>();
    private Queue<Cliente1> caja1 = new Queue<>();
    private Queue<Cliente1> caja2 = new Queue<>();
    private Queue<Cliente1> caja3 = new Queue<>();

    private int clienteID = 1;

    public SimuladorSupermercado(){

        // Inicializar 25 carritos
        for (int i = 0; i < 25; i++) {
            carritos.push(new Cliente1(-1)); // Cliente ficticio para representar carrito vacío
        }

    }

    public void llegadaCliente(){
        System.out.println("Llega cliente#" + clienteID);
        if (carritos.isEmpty()) {
            System.out.println("No hay carritos, cliente espera.");
            return;
        }

        Cliente1 nuevo = new Cliente1(clienteID++);
        carritos.pop(); // toma un carrito

        // Escoge la caja con menos gente
        Queue<Cliente1> menor = caja1;
        if (caja2.size() < menor.size()) {
            menor = caja2;
        }
        if (caja3.size() < menor.size()) {
            menor = caja3;
        }

        menor.push(nuevo);
        System.out.println(nuevo + " se forma en la caja " + obtenerNumeroCaja(menor));
    }

    public void procesarPago() throws Exception{
        procesarCaja(caja1, "1");
        procesarCaja(caja2, "2");
        procesarCaja(caja3, "3");
    }

    private void procesarCaja(Queue<Cliente1> caja, String numero){
        if (!caja.isEmpty()) {
            Cliente1 atendido = caja.pop();
            System.out.println(atendido + " pagó en caja " + numero);
            carritos.push(new Cliente1(-1)); // devuelve carrito
        }
    }

    private int obtenerNumeroCaja(Queue<Cliente1> caja) {
        if (caja == caja1) {
            return 1;
        }
        if (caja == caja2) {
            return 2;
        }
        return 3;
    }

    public void estadoActual() {
        System.out.println("\n--- Estado Actual ---");
        System.out.println("Carritos disponibles: " + carritos.size());
        System.out.println("Caja1: " + caja1.size() + " personas");
        System.out.println("Caja2: " + caja2.size() + " personas");
        System.out.println("Caja3: " + caja3.size() + " personas");
    }
    
    
    // Simulación simple
    public static void main(String[] args) throws Exception {
        SimuladorSupermercado sim = new SimuladorSupermercado();

        // Simulamos 30 clientes llegando
        for (int i = 0; i < 30; i++) {
            sim.llegadaCliente();
            if (i % 3 == 0) sim.procesarPago(); // cada 3 clientes, se atiende uno en cada caja
            sim.estadoActual();
        }

        // Simulamos pagos finales
        for (int i = 0; i < 10; i++) {
            sim.procesarPago();
            sim.estadoActual();
        }
    }
    
}
