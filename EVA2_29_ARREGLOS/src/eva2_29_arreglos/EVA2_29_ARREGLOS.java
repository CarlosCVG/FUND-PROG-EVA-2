/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_29_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_29_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = new int[30];
        //vamos a llenar el arreglo de valores entre 0 y 99
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            //CASTING -> CONVIERTO UN DOUBLE A UN ENTERO (lo que esta a la derecha se convierte a la parte izquierda)
            System.out.print("[" + arreglo[i] + "]");
        }
    }
    
}
