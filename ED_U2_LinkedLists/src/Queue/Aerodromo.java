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
public class Aerodromo {

    private Queue<String> pista;

    public Aerodromo() {
        this.pista = new Queue<>(new LinkedList<>(), 16);
    }

    public void entrada(String matricula){
        if (pista.isFull()) {
            System.out.println("Pista llena. " + matricula + " espera.");
            return;
        }
        pista.push(matricula);
        System.out.println("Entró avioneta " + matricula);
    }

    public void salida() throws Exception {
        if (pista.isEmpty()) {
            System.out.println("No hay avionetas en pista.");
            return;
        }
        String saliente = pista.pop();
        System.out.println("Salió avioneta" + saliente);
    }

    public void retirada(String matricula){
        if (pista.isEmpty()) {
            System.out.println("Pista vacía.");
            return;
        }
        Queue<String> temporal = new Queue<>(new LinkedList<>(), 16);
        boolean encontrada = false;

        while (!pista.isEmpty()) {
            String actual = pista.pop();
            if (actual.equals(matricula)) {
                encontrada = true;
                break; //descartamos la avioneta y todas las siguientes
            } else {
                temporal.push(actual);
            }
        }
        if (encontrada) {
            System.out.println("Retirada avioneta " + matricula + " por razones técnicas.");
        } else {
            System.out.println("Avioneta " + matricula + " no se encontró en pista.");
        }

        //restaurar las que quedaron antes de la retirada 
        while (!temporal.isEmpty()) {
            pista.push(temporal.pop());
        }
    }

    public void mostrarPista(){
        Queue<String> copia = new Queue<>(new LinkedList<>(), 16);
        System.out.print("Estado actual de pista: [");
        while (!pista.isEmpty()) {
            String av = pista.pop();
            System.out.println(av + " ");
            copia.push(av);
        }
        System.out.println("]");
        while (!copia.isEmpty()) {
            pista.push(copia.pop());
        }
    }

    public static void main(String[] args) throws Exception{
        Aerodromo a = new Aerodromo();

        // Simulación manual
        a.entrada("AX001");
        a.entrada("BX002");
        a.entrada("CX003");
        a.entrada("DX004");

        a.mostrarPista();

        a.retirada("BX002");
        a.mostrarPista();

        a.salida();
        a.mostrarPista();

        a.entrada("EX005");
        a.mostrarPista();
    }

}
