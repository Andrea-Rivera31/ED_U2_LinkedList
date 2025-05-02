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
public class HistorialNavegacion {
    
    private Queue<String> pila; // usando Queue como pila LIFO
    private int capacidad = 10;
    
    public HistorialNavegacion() {
        pila = new Queue<>(new LinkedList<>(), capacidad);
    }
    
    public void visitar(String url) {
        if (pila.size() >= capacidad) {
            // Eliminar la página más antigua (última de la pila)
            Queue<String> aux = new Queue<>(new LinkedList<>(), capacidad);
            // Guardamos todos excepto el más antiguo
            while (pila.size() > 1) {
                aux.push(pila.pop());
            }
            pila.pop(); // descarta la más antigua
            while (!aux.isEmpty()) {
                pila.push(aux.pop());
            }
        }

        pila.push(url); // agregar nueva página (última en top)
        System.out.println("Visitando: " + url);
    }

    public void volver() {
        if (pila.isEmpty()) {
            System.out.println("No hay páginas anteriores.");
            return;
        }
        String actual = pila.pop();
        if (pila.isEmpty()) {
            System.out.println("Volviste de: " + actual + " → Inicio (sin páginas)");
        } else {
            System.out.println("Volviste de: " + actual + " → Ahora estás en: " + pila.peek());
        }
    }

    public void mostrarHistorial() {
        Queue<String> aux = new Queue<>(new LinkedList<>(), capacidad);
        System.out.println("Historial (más reciente al final):");
        while (!pila.isEmpty()) {
            String url = pila.pop();
            System.out.println("- " + url);
            aux.push(url);
        }
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
    }
    
    public static void main(String[] args) {
        HistorialNavegacion navegador = new HistorialNavegacion();

        navegador.visitar("https://google.com");
        navegador.visitar("https://openai.com");
        navegador.visitar("https://youtube.com");
        navegador.visitar("https://github.com");

        navegador.mostrarHistorial();

        navegador.volver();
        navegador.volver();

        navegador.mostrarHistorial();
    }
}
