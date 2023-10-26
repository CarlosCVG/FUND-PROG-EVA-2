/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_ciclo_for;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //El for es --> desde
        //Se va a ejecutar desde un punto hasta otro
        //ctrl + space
        
        Scanner teclado = new Scanner(System.in);
        
        //for (Punto de incio; condición para el término; manera en que va a avanzar o retroceder)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("<------->");
        
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        
        //Imprimir números pares del 0 al 100
        
        
        for (int i = 0; i <= 100; i+= 2) {
            System.out.print(i + " - ");
        }  
    }
}
