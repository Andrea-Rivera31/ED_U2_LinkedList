/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class ColaAtencionCliente {

    private Queue<Cliente2> cola = new Queue<>();

    public void agregarCliente(Cliente2 nuevo){
        if (!nuevo.esPrioritario) {
            cola.push(nuevo); //estandar, al final 
            return;
        }

        Queue<Cliente2> temporal = new Queue<>();
        int size = 0;
        int lastPrioritarioIndex = -1;

        while (!cola.isEmpty()) {
            Cliente2 c = cola.pop();
            if (c.esPrioritario) {
                lastPrioritarioIndex = size;
            }
            temporal.push(c);
            size++;
        }

        int insertPos = (lastPrioritarioIndex == -1) ? 0 : lastPrioritarioIndex + 2;
        if (insertPos > size) {
            insertPos = size;
        }

        Queue<Cliente2> reconstruida = new Queue<>();
        {
            for (int i = 0; i <= size; i++) {
                if (i == insertPos) {
                    reconstruida.push(nuevo);
                }
                if (!temporal.isEmpty()) {
                    reconstruida.push(temporal.pop());
                }
            }

            this.cola = reconstruida;
        }
    }
    
    public Cliente2 atenderCliente(){
        if(cola.isEmpty()) return null;
        return cola.pop(); //atender = eliminar del frente
    }
    
    public void mostrarCola(){
        Queue<Cliente2> copia = new Queue<>();
        while(!cola.isEmpty()){
            Cliente2 c = cola.pop();
            System.out.println(c);
            copia.push(c);
        }
        //reconstruimos la cola original 
        Queue<Cliente2> restaurada = new Queue<>();
        while(!copia.isEmpty()){
            restaurada.push(copia.pop());
        }
        this.cola = restaurada;
    }
    
    

}
