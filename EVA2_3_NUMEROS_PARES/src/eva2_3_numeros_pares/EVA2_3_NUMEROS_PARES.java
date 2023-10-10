/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int valor, residuo;

        System.out.println("Indroduce el valor: ");
        valor = teclado.nextInt();
        
        residuo = valor % 2; //El módulo (%), calcula el residuo.

        if (residuo == 0) // si esto es verdad el número es par
            System.out.println("El valor es par: " + valor);
        else
            System.out.println("El valor es impar: " + valor);
    }  
}
