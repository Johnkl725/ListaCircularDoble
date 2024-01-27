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
public class ListasCircularesDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular LC = new ListaCircular();
        LC.insertarAlinicio(5);
        LC.insertarAlinicio(4);
        LC.insertarAlinicio(8);
        LC.insertarAlinicio(9);
        LC.insertarAlFinal(11);
        LC.insertarAlFinal(22);
        LC.insertarPorposicion(65, 2);
        LC.insertarDespuesdevalor(4, 33);
        LC.mostrarListaC();
        LC.eliminarAlinicio();
        LC.eliminarAlFinal();
        LC.eliminarPorposicion(2);
        LC.eliminarDespuesde(8);
        LC.mostrarListaC();
    }
    
}
