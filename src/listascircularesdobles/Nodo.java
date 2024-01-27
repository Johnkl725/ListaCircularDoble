/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascircularesdobles;

/**
 *
 * @author John
 */
public class Nodo {
    int dato;
    Nodo siguiente;
    Nodo previo;
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.previo=null;
    }
}
