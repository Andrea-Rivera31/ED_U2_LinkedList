/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    
//    public int obtenerNumeros(String cadena){
//        Stack<Character> obtener = new Stack<>();
//        
//    }
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                try {
                    stack.push(ch);
                } catch (Exception ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (ch == ')' || ch == '}' || ch == ']') {
                try {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char last = (char) stack.pop();
                    if (!isMatchingPair(last, ch)) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }
}
