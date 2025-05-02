/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author USUARIO
 */
public class DoubleLinkedList<E> {
    
    private NodoD<E> head;
    private int size;

    public DoubleLinkedList() {
    }

    public DoubleLinkedList(NodoD<E> head, int size) {
        this.head = head;
        this.size = size;
    }
    
    public int size() {
        return size;
    }
    
    public void print() {
        NodoD<E> P = head;
        while (P != null) {
            System.out.print(P.getData() + " <-> ");
            P = P.getSig();
        }
        System.out.println("null"); //se indica el final de la lista
    }
    
     public void add1(E val) {
        NodoD<E> newNode = new NodoD<>(val, null, null);
        if (head == null) {
            head = newNode;
        } else {
            NodoD<E> temp = head;
            while (temp.getSig() != null) {
                temp = temp.getSig();
            }
            temp.setSig(newNode);
            newNode.setAnt(temp);
        }
        size++;
    }
    
    public E get(int pos) {
        if (pos < 0 || pos >= size) {
            throw new RuntimeException("Índice fuera de rango");
        }
        NodoD<E> current = head;
        for (int i = 0; i < pos; i++) {
            current = current.getSig();
        }
        return current.getData();
    }

    
    public void delete(E value) {
        NodoD<E> current = head;
        while (current != null) {
            if (current.getData().equals(value)) {
                if (current.getAnt() != null) {
                    current.getAnt().setSig(current.getSig());
                } else {
                    head = current.getSig();
                }
                if (current.getSig() != null) {
                    current.getSig().setAnt(current.getAnt());
                }
                size--;
                return;
            }
            current = current.getSig();
        }
    }

    
    public boolean find(E value) {
        NodoD<E> p = head;
        while (p != null) {
            if (p.getData().equals(value)) {
                return true;
            }
            p = p.getSig();
        }
        return false;
    }
    
    public void update(E value, E newValue) {
        NodoD<E> current = head;
        while (current != null) {
            if (current.getData().equals(value)) {
                current.setData(newValue);
                return;
            }
            current = current.getSig();
        }
    }
    
//    public void addOrdered(E data) {
//        NodoD<E> newNode = new NodoD<>(data, null, null);
//        if (head == null || head.getData().compareTo(data) >= 0) {
//            newNode.setSig(head);
//            if (head != null) {
//                head.setAnt(newNode);
//            }
//            head = newNode;
//        } else {
//            NodoD<E> current = head;
//            while (current.getSig() != null && current.getSig().getData().compareTo(data) < 0) {
//                current = current.getSig();
//            }
//            newNode.setSig(current.getSig());
//            if (current.getSig() != null) {
//                current.getSig().setAnt(newNode);
//            }
//            newNode.setAnt(current);
//            current.setSig(newNode);
//        }
//        size++;
//    }
    
    public boolean esPalindromo() {
        if (head == null || head.getSig() == null) {
            return true;
        }
        NodoD<E> left = head;
        NodoD<E> right = head;
        while (right.getSig() != null) {
            right = right.getSig();
        }
        while (left != right && left.getAnt() != right) {
            if (!left.getData().equals(right.getData())) {
                return false;
            }
            left = left.getSig();
            right = right.getAnt();
        }
        return true;
    }
    
    public void eliminarNodosDuplicados() {
    if (head == null) {
        return; // Lista vacía, no hay duplicados
    }

    NodoD<E> actual = head; // Nodo actual para recorrer la lista

    while (actual != null) {
        NodoD<E> comparador = actual.getSig(); // Comenzamos comparando desde el siguiente nodo

        while (comparador != null) {
            if (actual.getData().equals(comparador.getData())) {
                // Eliminar el nodo duplicado
                if (comparador.getSig() != null) {
                    comparador.getSig().setAnt(comparador.getAnt());
                }
                comparador.getAnt().setSig(comparador.getSig());
            }
            comparador = comparador.getSig(); // Avanzar al siguiente nodo
        }

        actual = actual.getSig(); // Pasar al siguiente nodo base para seguir comparando
    }
} 
}
