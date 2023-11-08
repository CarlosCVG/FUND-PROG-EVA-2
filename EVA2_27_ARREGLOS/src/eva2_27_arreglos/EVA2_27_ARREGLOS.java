/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_27_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_27_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ARREGLOS
        //Una secuencia de valores consecutivos del mismo tipo
        //Inmutables en cuato a tamaño
        //En java son objetos
        
        //Declaramos un arreglo que almacena 10 enteros
        //El acceso a los arreglos es aleatorio
        //El acceso a los arreglos es a traves de un índice
        //El primer elemento esta en la posicion 0
        //El primer elemento esta en la posicion n-1, donde N es el tamaño del arreglo
        int [] arregloEnteros = new int [10];
        
        arregloEnteros[0] = 100;
        arregloEnteros[1] = 200;
        arregloEnteros[2] = 300;
        arregloEnteros[3] = 400;
        arregloEnteros[4] = 500;
        arregloEnteros[5] = 600;
        arregloEnteros[6] = 700;
        arregloEnteros[7] = 800;
        arregloEnteros[8] = 900;
        arregloEnteros[9] = 1000;
        
        System.out.println("El número del arreglo en la posición 0 es: " + arregloEnteros[0]);
        
        String [] arregloCade = new String[5];
        arregloCade[0] = "Hola";
        arregloCade[1] = " ";
        arregloCade[2] = "Mundo";
        arregloCade[3] = " ";
        arregloCade[4] = "Cruel!!!!";
        
        System.out.println(arregloCade[0] + " " + arregloCade[2]);
    }    
}
