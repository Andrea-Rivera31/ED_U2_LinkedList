/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import static Stack.StackUtils.esPalindromo;
import static Stack.StackUtils.estaBalanceada;
import static Stack.StackUtils.estaBalanceado;
import static Stack.StackUtils.extraerContenido;
import static Stack.StackUtils.invertirCadena;

/**
 *
 * @author USUARIO
 */
public class TestPila {

    public static void main(String[] args) {
        String expresion1 = "(a + b) * (c - d)";
        String expresion2 = "(a + b * (c - d)";
        String expresion3 = "((())())";
        String expresion4 = "())(";

        System.out.println("Expresión 1: " + estaBalanceado(expresion1)); // true
        System.out.println("Expresión 2: " + estaBalanceado(expresion2)); // false
        System.out.println("Expresión 3: " + estaBalanceado(expresion3)); // true
        System.out.println("Expresión 4: " + estaBalanceado(expresion4)); // false

        String palabra1 = "alila";
        String palabra2 = "cara";
        String palabra3 = "Anita lava la tina"; // este dará false por mayúsculas y espacios

        System.out.println(palabra1 + " ¿es palíndromo? " + esPalindromo(palabra1));
        System.out.println(palabra2 + " ¿es palíndromo? " + esPalindromo(palabra2));
        System.out.println(palabra3 + " ¿es palíndromo? " + esPalindromo(palabra3));

        String cadena1 = "[3 + 4 * (5 + 3])";  // incorrecta
        String cadena2 = "[3 + 4 * (5 + 3)]";  // correcta

        System.out.println(cadena1 + " → " + estaBalanceada(cadena1)); // false
        System.out.println(cadena2 + " → " + estaBalanceada(cadena2)); // true
        
        String cadena = "abc(123)xyz";
        String resultado = extraerContenido(cadena);
        System.out.println("Contenido encontrado: " + resultado);   
        
        String cadena3 = "Hola Mundo";
        String invertido = invertirCadena(cadena3);

        System.out.println("Cadena original: " + cadena3);
        System.out.println("Cadena invertida: " + invertido);
    }
}
