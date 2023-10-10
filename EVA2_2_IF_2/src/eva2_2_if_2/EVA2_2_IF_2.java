/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Indroduce el valor 1: ");
        valor1 = teclado.nextInt();
        System.out.println("Indroduce el valor 2: ");
        valor2 = teclado.nextInt();

        if (valor1 > valor2) 
            System.out.println("El valor 1 es el mas grande: " + valor1);
            //concatenar (para que sea un solo Print, no uno para el valor y otro para el texto)
        else { //cuando el resultado es falso
            if (valor1 == valor2) //si esto es verdad se ejecuta lo de abajo de este if
                System.out.println("Los dos valores son iguales");
            else 
                System.out.println("El valor 2 es el mas grande: " + valor2);
        }
    }

}
