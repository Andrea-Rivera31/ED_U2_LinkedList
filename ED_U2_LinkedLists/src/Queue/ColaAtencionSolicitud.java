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
public class ColaAtencionSolicitud {
    private Queue<Solicitud> cola = new Queue<>(new LinkedList<>(), 100);//100

    public void agregar_solicitud(Solicitud nueva) {
        if (!nueva.esUrgente()) {
            if (!cola.isFull()) cola.push(nueva);
            return;
        }

        Queue<Solicitud> temp = new Queue<>(new LinkedList<>(), 100);
        int size = 0;
        int lastUrgente = -1;

        while (!cola.isEmpty()) {
            Solicitud s = cola.pop();
            if (s.esUrgente()) lastUrgente = size;
            temp.push(s);
            size++;
        }

        int insertPos = (lastUrgente == -1) ? 0 : lastUrgente + 2;
        if (insertPos > size) insertPos = size;

        Queue<Solicitud> reconstruida = new Queue<>(new LinkedList<>(), 100);
        for (int i = 0; i <= size; i++) {
            if (i == insertPos) {
                reconstruida.push(nueva);
            }
            if (!temp.isEmpty()) {
                reconstruida.push(temp.pop());
            }
        }

        this.cola = reconstruida;
    }

    public Solicitud atender_siguiente() {
        if (!cola.isEmpty()) return cola.pop();
        return null;
    }

    public void mostrar_cola() {
        Queue<Solicitud> temp = new Queue<>(new LinkedList<>(), 100);
        System.out.println("Cola actual:");
        while (!cola.isEmpty()) {
            Solicitud s = cola.pop();
            System.out.println(" - " + s);
            temp.push(s);
        }
        while (!temp.isEmpty()) {
            cola.push(temp.pop());
        }
    }
}
