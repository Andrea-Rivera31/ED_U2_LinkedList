/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import Listas.LinkedList;

/**
 *
 * @author USUARIO
 */
public class Stack<E> {

    private LinkedList<E> lista;
    private int size;

    public Stack(LinkedList<E> lista, int size) {
        this.lista = lista;
        this.size = size;
    }

    public Stack() {
    }

    /**
     * Agrega un elemento a la pila.
     *
     * @param val Elemento a agregar.
     */
    public void push(E val) {
        lista.add(val);
        size++;
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return Elemento en la cima de la pila o null si la pila está vacía.
     */
    public E pop() {
        if (lista.getSize() == 0) {
            System.out.println("Stack underflow: La pila está vacía");
            return null;
        }
        int lastIndex = lista.getSize() - 1;
        E val = lista.get(lastIndex);
        lista.deletePos(lastIndex);
        size--;
        return val;
    }

//    /**
//     * Elimina y devuelve el elemento en la cima de la pila.
//     * @return Elemento en la cima de la pila.
//     * @throws Exception Si la pila está vacía.
//     */
//    public E pop() throws Exception {
//        if (lista.getSize() == 0) {
//            throw new Exception("Stack underflow: La pila está vacía");
//        }
//        E val = lista.get(0);
//        lista.deletePos(0);
//        return val;
//    } //crear eliminar el ultimo t lo reemplazo
    
    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     * @return Elemento en la cima de la pila o null si la pila está vacía.
     */
    public E peek() {
        if (lista.getSize() == 0) {
            System.out.println("Stack underflow: La pila está vacía");
            return null;
        }
        return lista.get(lista.getSize() - 1);
    }

//    /**
//     * Devuelve el elemento en la cima de la pila sin eliminarlo.
//     *
//     * @return Elemento en la cima de la pila.
//     * @throws Exception Si la pila está vacía.
//     */
//    public E peek() throws Exception {
//        if (lista.getSize() == 0) {
//            throw new Exception("Stack underflow: La pila está vacía");
//        }
//        return lista.get(0);
//    }// obtener el ultimo 
    
    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return lista.getSize() == 0;
    }

    /**
     * Devuelve el número de elementos en la pila.
     *
     * @return Tamaño de la pila.
     */
    public int getSize() {
        return lista.getSize();
    }

    public void clear() {
        lista.clear(); // Usa el método clear() de LinkedList para vaciar la lista
        size = 0;       // Reinicia el contador de elementos
    }

}
