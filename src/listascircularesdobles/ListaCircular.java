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
public class ListaCircular {
    Nodo inicio;
    Nodo fin;
    public ListaCircular(){
        this.inicio=null;
        this.fin=null;
    }
    //Lista doble circular
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }
        return false;
    }
    public void insertarAlinicio(int valor){
        Nodo nuevo = new Nodo(valor);
        if(estaVacia()){
            inicio=nuevo;
            fin=nuevo;
            nuevo.siguiente=inicio;
            nuevo.previo=fin;
        }else{
            fin.siguiente=nuevo;
            nuevo.previo=fin;
            nuevo.siguiente=inicio;
            inicio.previo=nuevo;
            inicio=nuevo;
        }
    }
    public void insertarAlFinal(int valor){
        Nodo nuevo = new Nodo(valor);
        if(estaVacia()){
            inicio=nuevo;
            fin=nuevo;
            nuevo.siguiente=inicio;
            nuevo.previo=fin;
        }else{
            fin.siguiente=nuevo;
            nuevo.previo=fin;
            inicio.previo=nuevo;
            nuevo.siguiente=inicio;
            fin=nuevo;
        }
    }
    public void insertarPorposicion(int valor,int pos){
        Nodo nuevo = new Nodo(valor);
        if(estaVacia()){
            inicio=nuevo;
            fin=nuevo;
            nuevo.siguiente=inicio;
            nuevo.previo=fin;
        }else{
            if(pos<0){
                throw new IndexOutOfBoundsException("Posicion invalida");
            }else if(pos==0){
                insertarAlinicio(valor);
            }else{
                Nodo recorr = inicio;
                int cont=0;
                do{
                   recorr=recorr.siguiente;
                   cont++; 
                }while(recorr!=inicio&&cont<pos-1);
                if(pos+1<cont){
                    throw new IndexOutOfBoundsException("Se ha excedido el uso de memoria");
                }else{
                    nuevo.siguiente=recorr.siguiente;
                    recorr.siguiente.previo=nuevo;
                    nuevo.previo=recorr;
                    recorr.siguiente=nuevo; 
                }
            }
        }
    }
    public void insertarDespuesdevalor(int bvalor,int valor){
        Nodo nuevo = new Nodo(valor);
        if(estaVacia()){
            inicio=nuevo;
            fin=nuevo;
            nuevo.siguiente=inicio;
            nuevo.previo=fin;
        }else{
            Nodo recorr = inicio;
            do {
                if (recorr.dato == bvalor) {
                    nuevo.siguiente = recorr.siguiente;
                    recorr.siguiente.previo=nuevo;
                    nuevo.previo=recorr;
                    recorr.siguiente = nuevo;
                }
                recorr = recorr.siguiente;
            } while (recorr != inicio);
        }
    }
    public void eliminarAlinicio(){
        if(estaVacia()){
            throw new NullPointerException("No existen elementos en la lista");
        }else{
            fin.siguiente=inicio.siguiente;
            inicio.siguiente.previo=fin;
            inicio=inicio.siguiente;
        }
    }
    public void eliminarAlFinal(){
        if(estaVacia()){
            throw new NullPointerException("No existen elementos en la lista");
        }else{
            inicio.previo=fin.previo;
            fin.previo.siguiente=inicio;
            fin=fin.previo;
        }
    }
    public void eliminarPorposicion(int pos){
        if(pos<0){
            throw new IndexOutOfBoundsException("Se ha ido fuera");
        }else if(pos==0){
            eliminarAlinicio();
        }else{
            Nodo recorrido = inicio;
            int cont=0;
            while(recorrido!=fin&&cont<pos-1){
                recorrido=recorrido.siguiente;
                cont++;
            }
            if(recorrido==fin){
                eliminarAlFinal();
            }else{
                recorrido.siguiente=recorrido.siguiente.siguiente;
                recorrido.siguiente.previo=recorrido;
                recorrido=recorrido.siguiente;
            }
        }
    }
    public void eliminarDespuesde(int valor){
        if(estaVacia()){
            System.out.println("No se puede eliminar nada");
        }else{
            Nodo temp = inicio;
            while(temp!=fin&&temp.dato!=valor){
                temp=temp.siguiente;
            }
            if(temp==fin){
                temp.siguiente=inicio.siguiente;
                inicio.siguiente.previo=temp;
                inicio=inicio.siguiente;
            }else{
                temp.siguiente=temp.siguiente.siguiente;
                temp.siguiente.previo=temp;
                temp=temp.siguiente;
            }
        }
    }
    public void mostrarListaC(){
        Nodo actual=inicio;
        do {
            System.out.print("["+actual.dato + "]");
            actual = actual.siguiente;
        } while (actual != inicio);
        System.out.println("");
    }
    
}
