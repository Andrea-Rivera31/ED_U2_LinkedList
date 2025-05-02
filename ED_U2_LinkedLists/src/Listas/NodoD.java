/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author USUARIO
 */
public class NodoD<E> {
    
    private E data;
    private NodoD<E> Sig, Ant;

    public NodoD() {
    }

    public NodoD(E data, NodoD<E> Sig, NodoD<E> Ant) {
        this.data = data;
        this.Sig = Sig;
        this.Ant = Ant;
    }
    
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public NodoD<E> getSig() {
        return Sig;
    }

    public void setSig(NodoD<E> Sig) {
        this.Sig = Sig;
    }

    public NodoD<E> getAnt() {
        return Ant;
    }

    public void setAnt(NodoD<E> Ant) {
        this.Ant = Ant;
    }
    
    
}
