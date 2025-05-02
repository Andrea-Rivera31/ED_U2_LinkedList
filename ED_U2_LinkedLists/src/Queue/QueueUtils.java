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
public class QueueUtils {

    public static <E> boolean colasIdenticas(Queue<E> cola1, Queue<E> cola2) {
        if (cola1.size() != cola2.size()) {
            return false;
        }

        LinkedList<E> temp1 = new LinkedList<>();
        LinkedList<E> temp2 = new LinkedList<>();

        boolean iguales = true;
        int size = cola1.size();

        for (int i = 0; i < size; i++) {
            E elem1 = null;
            E elem2 = null;

            try {
                elem1 = cola1.pop();
            } catch (Exception e) {
                iguales = false;
            }

            try {
                elem2 = cola2.pop();
            } catch (Exception e) {
                iguales = false;
            }

            if ((elem1 == null && elem2 != null) || (elem1 != null && !elem1.equals(elem2))) {
                iguales = false;
            }

            temp1.add(elem1);
            temp2.add(elem2);
        }

        // Restauramos el contenido original de ambas colas
        for (int i = 0; i < size; i++) {
            try {
                cola1.push(temp1.get(i));
                cola2.push(temp2.get(i));
            } catch (Exception e) {
                System.out.println("Error al restaurar las colas: " + e.getMessage());
            }
        }

        return iguales;
    }
    
    
}
