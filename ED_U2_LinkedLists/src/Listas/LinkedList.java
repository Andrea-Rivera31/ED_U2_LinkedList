/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author USUARIO
 */
public class LinkedList<E> {

    private Node<E> head;
    private int size;

    public int getSize() {
        return size;
    }

    public Node<E> getHead() {
        return head;
    }
    
    
    public void print() {
        Node<E> P = head;
        while (P != null) {
            System.out.print(P.getData() + " -> ");
            P = P.getNext();
        }
        System.out.println("null"); //se indica el final de la lista
    }

    /**
     * Compara cada valor de la lista para encontrar el elemento pasado como
     * parametro
     *
     * @param val
     * @return
     */
    public boolean isInList(E val) {

        Node<E> p = head;

        while (p != null) {

            E dato = p.getData();
//            Comparable cDato = (Comparable)dato;

//            Comparable cDato = (Comparable)p.getData();
            if (dato.equals(val)) {
                return true;
            }

            p = p.getNext();
        }

        return false;
    }

    public E getMaxValue() {
        return null;
    }

    public void prueba() {
        Node<E> p = head;
        Node<E> q = p.getNext();

        E datoP = p.getData();
        E datoQ = p.getData();

        Comparable cDatoP = (Comparable) datoP;
        Comparable cDatoQ = (Comparable) datoQ;

        int resultado = cDatoP.compareTo(cDatoQ);

        System.out.println("Resultado: " + resultado);
    }

    /**
     * Agregar un elemento de tipo E a la lista
     *
     * @param e
     */
    public void add(E val) {
        Node<E> n = new Node<>(val);

        if (head == null) {
            head = n;
        } else {
            Node<E> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }

            p.setNext(n);
        }
        size++;
    }

    public E get(int pos) {
        Node<E> p = head;
        for (int i = 0; i < size; i++) {
            if (i == pos) {
                return p.getData();
            } else {
                p = p.getNext();
            }
        }
        return null;
    }

    /**
     * Metodo para eliminar un nodo con un valor dado
     *
     * @param e
     */
    public void delete(E value) {

        if (head == null) {
            return;
        }
        if (head.getData().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }
        Node<E> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public void deletePos(int position) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node<E> temp = head;

        // Si se quiere eliminar el primer nodo
        if (position == 0) {
            head = temp.getNext();
            size--;
            return;
        }

        // Buscar el nodo anterior al que se desea eliminar
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.getNext();
        }

        // Si la posición está fuera de los límites de la lista
        if (temp == null || temp.getNext() == null) {
            System.out.println("Posición fuera de rango.");
            return;
        }

        // Saltar el nodo a eliminar
        temp.setNext(temp.getNext().getNext());
        size--;
    }

    /**
     * Agregar en una posicion especifica
     *
     * @param e
     */
    public void addInPosition(int pos, E value) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Node<E> newNode = new Node<>(value);
        if (pos == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    /**
     * Metodo para buscar un valor en la lista
     *
     * @param e
     */
    public boolean find(E value) {
        Node<E> current = head;
        while (current != null) {
            if (current.getData().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * Agregar al inicio de la lista
     *
     * @param e
     */
    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    /**
     * Busca el nodo con el valor value y lo reemplaza por el valor newValue
     *
     * @param val
     * @param newVal
     */
    public void update(E value, E newValue) {
        Node<E> current = head;
        while (current != null) {
            if (current.getData().equals(value)) {
                current.setData(newValue);
                return;
            }
            current = current.getNext();
        }
    }

    public void addOrdered(E value, java.util.Comparator<E> comparator) {
        Node<E> newNode = new Node<>(value);
        if (head == null || comparator.compare(head.getData(), value) > 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.getNext() != null && comparator.compare(current.getNext().getData(), value) < 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    public void moverNodoAlFinal(E valor) {
        if (head == null || head.getNext() == null) {
            return; // La lista está vacía o tiene un solo nodo, no es necesario mover nada.
        }

        Node<E> prev = null;
        Node<E> current = head;

        // Buscar el primer nodo con el valor
        while (current != null && !current.getData().equals(valor)) {
            prev = current;
            current = current.getNext();
        }

        // Si no se encuentra el valor o ya está al final, no hacemos nada
        if (current == null || current.getNext() == null) {
            return;
        }

        // Si el nodo a mover es el head, actualizar head
        if (prev == null) {
            head = head.getNext();
        } else {
            prev.setNext(current.getNext());
        }

        // Mover el nodo al final
        Node<E> last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(current);
        current.setNext(null);
    }

    public void intercambiarNodos(E valor1, E valor2) {
        if (valor1.equals(valor2) || head == null) {
            return; // Si los valores son iguales o la lista está vacía, no hacemos nada.
        }

        Node<E> prev1 = null, prev2 = null;
        Node<E> nodo1 = head, nodo2 = head;

        // Buscar nodo1 y su previo
        while (nodo1 != null && !nodo1.getData().equals(valor1)) {
            prev1 = nodo1;
            nodo1 = nodo1.getNext();
        }

        // Buscar nodo2 y su previo
        while (nodo2 != null && !nodo2.getData().equals(valor2)) {
            prev2 = nodo2;
            nodo2 = nodo2.getNext();
        }

        // Si alguno de los valores no se encuentra, no hacemos nada
        if (nodo1 == null || nodo2 == null) {
            return;
        }

        // Si nodo1 no es head, enlazar su previo a nodo2
        if (prev1 != null) {
            prev1.setNext(nodo2);
        } else {
            head = nodo2;
        }

        // Si nodo2 no es head, enlazar su previo a nodo1
        if (prev2 != null) {
            prev2.setNext(nodo1);
        } else {
            head = nodo1;
        }

        // Intercambiar los next de nodo1 y nodo2
        Node<E> temp = nodo1.getNext();
        nodo1.setNext(nodo2.getNext());
        nodo2.setNext(temp);
    }

    public void invertirLista() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void eliminarNodosDuplicados() {
        Node<E> current = head;
        while (current != null) {
            Node<E> runner = current;
            while (runner.getNext() != null) {
                if (runner.getNext().getData().equals(current.getData())) {
                    runner.setNext(runner.getNext().getNext());
                } else {
                    runner = runner.getNext();
                }
            }
            current = current.getNext();
        }
    }

    public void agregarNSumaAnterior(int n) {
        if (head == null || head.getNext() == null) {
            return; // Se necesitan al menos dos nodos
        }

        Node<E> ultimo = head;
        while (ultimo.getNext() != null) {
            ultimo = ultimo.getNext();
        }

        Node<E> penultimo = head;
        while (penultimo.getNext() != ultimo) {
            penultimo = penultimo.getNext();
        }

        for (int i = 0; i < n; i++) {
            E nuevoValor = (E) (Integer) ((Integer) penultimo.getData() + (Integer) ultimo.getData());
            Node<E> nuevoNodo = new Node<>(nuevoValor);
            ultimo.setNext(nuevoNodo);
            penultimo = ultimo;
            ultimo = nuevoNodo;
        }
    }

    public void reordenarParImpar() {
        if (head == null || head.getNext() == null) {
            return;
        }

        Node<E> parHead = null, parTail = null;
        Node<E> imparHead = null, imparTail = null;
        Node<E> current = head;
        int index = 0;

        while (current != null) {
            Node<E> next = current.getNext();
            current.setNext(null);

            if (index % 2 == 1) { // Posiciones pares (índice 1 basado en 0)
                if (parHead == null) {
                    parHead = parTail = current;
                } else {
                    parTail.setNext(current);
                    parTail = current;
                }
            } else { // Posiciones impares
                if (imparHead == null) {
                    imparHead = imparTail = current;
                } else {
                    imparTail.setNext(current);
                    imparTail = current;
                }
            }
            current = next;
            index++;
        }

        if (parTail != null) {
            parTail.setNext(imparHead);
            head = parHead;
        } else {
            head = imparHead;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    // deleteLast
    // delete por pos
}
