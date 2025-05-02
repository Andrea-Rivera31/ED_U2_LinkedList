/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import Listas.LinkedList;
import Listas.Node;

/**
 *
 * @author USUARIO
 */
public class Queue<E> {

    private LinkedList<E> lista;
    private int maxSize;

    public Queue() {
    this.lista = new LinkedList<>();
    this.maxSize = 100;
}

    public Queue(LinkedList<E> lista, int maxSize) {
        if (lista == null) {
            System.out.println("Lista recibida es null. Inicializando nueva lista.");
            this.lista = new LinkedList<>();
        } else {
            this.lista = lista;
        }
        this.maxSize = maxSize;
    }

    /**
     * Inserta un elemento al final de la cola.
     *
     * @param val Elemento a insertar.
     *
     */
    public void push(E val) {
        if (isFull()) {
            throw new RuntimeException("Queue overflow: La cola está llena");
        }
        lista.add(val); // agrega al final
    }

    /**
     * Elimina y devuelve el elemento al frente de la cola.
     *
     * @return Elemento al frente de la cola.
     *
     */
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow: La cola está vacía");
        }
        E val = lista.get(0);      // obtiene el primero
        lista.deletePos(0);       // elimina el primero
        return val;
    }

    /**
     * Devuelve el elemento al frente de la cola sin eliminarlo.
     *
     * @return Elemento al frente de la cola.
     *
     */
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow: La cola está vacía");
        }
        return lista.get(0); // solo lo ve, no lo elimina
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return lista.getSize() == 0;
    }

    /**
     * Verifica si la cola ha alcanzado su capacidad máxima.
     *
     * @return true si la cola está llena, false en caso contrario.
     */
    public boolean isFull() {
        if (lista == null) {
        // Previene el NullPointerException y lanza error claro
        throw new IllegalStateException("Error: la lista no fue inicializada.");
    }
    return lista.getSize() >= maxSize;
    }

    /**
     * Elimina todos los elementos de la cola.
     */
    public void clear() {
        lista.clear(); // metodo en linkedList
    }

    /**
     * Devuelve el número de elementos en la cola.
     *
     * @return Número de elementos.
     */
    public int size() {
        return lista.getSize();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("[");
        Node<E> p = lista.getHead();
        while (p != null) {
            System.out.print(p.getData());
            if (p.getNext() != null) {
                System.out.print(", ");
            }
            p = p.getNext();
        }
        System.out.println("]");

    }

}
