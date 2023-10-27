/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int num, factorial1 = 1, factorial2 = 1;
        
        System.out.println("Introduce el número del que quieres conocer el factorial: ");
        num = teclado.nextInt();
        
        //De forma 1 a N
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " - ");
            factorial1 *= i;
        }
        System.out.println("");
        //De forma N a 1
        for (int i = num; i >= 1; i--) {
            System.out.print(i + " - ");
            factorial2 *= i;
        }
        System.out.println("");
        System.out.println("El factorial de " + num + " es: " + factorial1);
        System.out.println("El factorial de " + num + " es: " + factorial2);
    }
    
}
