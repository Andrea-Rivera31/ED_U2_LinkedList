/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import Listas.LinkedList;
import static Queue.QueueUtils.colasIdenticas;

/**
 *
 * @author USUARIO
 */
public class TestCola {

    public static void main(String[] args) {
        
        LinkedList<Integer> lista1 = new LinkedList<>();
LinkedList<Integer> lista2 = new LinkedList<>();

        Queue q1 = new Queue<>();
        Queue q2 = new Queue<>();

        //enqueue()
        q1.push(2);
        q1.push(4);
        q1.push(6);
        q1.push(8);
        q1.push(10);
        q1.print();

        q2.push(2);
        q2.push(4);
        q2.push(6);
        q2.push(8);
        q2.push(10);
        q2.print();

        //dequeue()
        //q1.pop();
        //q1.print();
        

        //peek
        //q1.peek();
        //q1.print();
        //System.out.println("Valor al inicio de la cola: " + q1);

        
        System.out.println(QueueUtils.colasIdenticas(q1, q2));
    }

}
