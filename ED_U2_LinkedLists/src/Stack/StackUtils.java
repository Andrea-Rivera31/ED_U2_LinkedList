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
public class StackUtils {

    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>(new LinkedList<>(), 0);

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    return false; // Cierre sin apertura
                }
                pila.pop();
            }
        }

        return pila.isEmpty(); // Si está vacía, está balanceado
    }

    public static boolean esPalindromo(String cadena) {
        Stack<Character> pila = new Stack<>(new LinkedList<>(), 0);

        // Meter todos los caracteres en la pila
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }

        // Comparar con los caracteres al sacar de la pila
        for (int i = 0; i < cadena.length(); i++) {
            char desdePila = pila.pop();
            if (desdePila != cadena.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>(new LinkedList<>(), 0);

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if (!esPar(tope, c)) {
                    return false;
                }
            }
        }
        return pila.isEmpty(); // debe estar vacia si esta bien balanceada
    }

    private static boolean esPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
                || (apertura == '[' && cierre == ']')
                || (apertura == '{' && cierre == '}');
    }

    public static String extraerContenido(String cadena) {
        Stack<Character> pila = new Stack<>(new LinkedList<>(), 0);
        boolean leyendo = false;
        String contenido = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(') {
                leyendo = true;
                pila.clear(); // Limpiar pila en cada nuevo paréntesis
            } else if (c == ')' && leyendo) {
                // Extraer lo que esté en la pila y formar el contenido
                while (!pila.isEmpty()) {
                    contenido = pila.pop() + contenido;
                }
                return contenido.length() > 0 ? contenido : "No se encontró contenido";
            } else if (leyendo) {
                pila.push(c);
            }
        }

        return "No se encontró contenido dentro de paréntesis";
    }
    
    public static String invertirCadena(String cadena) {
        // Crear una pila para almacenar los caracteres
        Stack<Character> pila = new Stack<>(new LinkedList<>(), 0); 

        // Empujar todos los caracteres de la cadena a la pila
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }

        // Crear una cadena vacía para almacenar los caracteres invertidos
        String cadenaInvertida = "";

        // Extraer los caracteres de la pila y formar la cadena invertida
        while (!pila.isEmpty()) {
            cadenaInvertida += pila.pop();  // Concatenar los caracteres
        }

        return cadenaInvertida;  // Retornar la cadena invertida
    }

//    public static String invertirCadena(String cadena) {
//        // Crear una pila para almacenar los caracteres
//        Stack<Character> pila = new Stack<>();
//
//        // Empujar todos los caracteres de la cadena a la pila
//        for (int i = 0; i < cadena.length(); i++) {
//            pila.push(cadena.charAt(i));
//        }
//
//        // Crear una cadena para almacenar los caracteres invertidos
//        StringBuilder cadenaInvertida = new StringBuilder();
//
//        // Extraer los caracteres de la pila y formar la cadena invertida
//        while (!pila.isEmpty()) {
//            cadenaInvertida.append(pila.pop());
//        }
//
//        return cadenaInvertida.toString();  // Retornar la cadena invertida
//    }
    
}
