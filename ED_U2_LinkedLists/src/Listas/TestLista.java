/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author USUARIO
 */
public class TestLista {

    public static void main2(String[] args) {
        Mascota m = new Mascota();
        m.setNombre("Asesino");
        m.setEdad(8);

        System.out.println(m);
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(15);
        lista1.add(30);
        lista1.add(45);
        lista1.add(60);

        System.out.println("************************");
        lista1.print();

        System.out.println("************************");
        lista1.prueba();

        Mascota m1 = new Mascota();
        m1.setNombre("Pepita");
        m1.setEdad(10);

        Mascota m2 = new Mascota();
        m2.setNombre("Asesino");
        m2.setEdad(8);

        System.out.println("************************");
        System.out.println("ComparaciÃ³n = " + m1.compareTo(m2));

        Persona p1 = new Persona();
        p1.setPromedio(4);

        Persona p2 = new Persona();
        p2.setPromedio(5);

        System.out.println("************************");
        System.out.println("ComparaciÃ³n = " + p1.compareTo(p2));

        LinkedList<Mascota> listaM = new LinkedList<>();
        listaM.add(new Mascota("001", "Gatica", 10));
        listaM.add(new Mascota("002", "Asesino", 7));
        listaM.add(new Mascota("003", "Pepe", 2));
        listaM.add(new Mascota("004", "Perla", 5));

        System.out.println("************************");
        listaM.print();

        System.out.println("************************");
        listaM.prueba();

        System.out.println("************************");
        System.out.println("Existe?: " + listaM.isInList(new Mascota("002", "Asesino", 17)));

        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("Kelitz");
        lista2.add("Karol");
        lista2.add("Julieth");
        lista2.add("Andrea");

        System.out.println("************************");
        lista2.print();

        System.out.println("************************");
        lista2.prueba();

        System.out.println("************************");
        System.out.println(lista2.isInList("Karola"));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);

        System.out.println("Lista original:");
        list.print();

        list.moverNodoAlFinal(2);

        System.out.println("Lista después de mover el primer 2 al final:");
        list.print();

        LinkedList<Integer> list0 = new LinkedList<>();
        list0.add(1);
        list0.add(2);
        list0.add(3);
        list0.add(4);
        list0.add(5);

        System.out.println("Lista original:");
        list0.print();

        list0.eliminarNodosDuplicados();

        System.out.println("Lista después de eliminar duplicados:");
        list0.print();

        list0.intercambiarNodos(3, 5);

        System.out.println("Lista después de intercambiar 2 y 4:");
        list0.print();

        list0.invertirLista();

        System.out.println("Lista después de invertir:");
        list0.print();
        
        
        
        LinkedList<Integer> list3 = new LinkedList<>();
    list3.add(1);
    list3.add(2);
    list3.add(3);
    list3.add(4);
    list3.add(5);
    list3.add(6);
    
    System.out.println("Lista original:");
    list3.print();
    
    list3.reordenarParImpar();
    
    System.out.println("Lista después de reordenar por posiciones pares e impares:");
    list3.print();
    }
}
