/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
/**
 *
 * @author USUARIO
 */
public class TestListaDoblemente {
     public static void main(String[] args) {
        DoubleLinkedList<Integer> lista = new DoubleLinkedList<>();
        lista.add1(1);
        lista.add1(2);
        lista.add1(3);
        lista.add1(2);
        lista.add1(1);

        lista.print();
        System.out.println("Es palíndromo: " + lista.esPalindromo());

        lista.add1(4);
        lista.print();
        System.out.println("Es palíndromo: " + lista.esPalindromo());
        
         DoubleLinkedList<Integer> lista1 = new DoubleLinkedList<>();

        // Agregar elementos a la lista (incluyendo duplicados)
        lista1.add1(1);
        lista1.add1(2);
        lista1.add1(3);
        lista1.add1(2);
        lista1.add1(4);
        lista1.add1(3);

        System.out.println("Lista original:");
        lista1.print();

        // Eliminar duplicados
        lista1.eliminarNodosDuplicados();

        System.out.println("Lista después de eliminar duplicados:");
        lista1.print();
    }
}
