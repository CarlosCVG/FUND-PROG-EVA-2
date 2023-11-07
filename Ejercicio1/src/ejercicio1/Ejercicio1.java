/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el primer número:");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = teclado.nextInt();

        if ((num1 >= 0) && (num2 >= 0)) {
            if (num2 > num1) {
                for (int i = num1; i <= num2; i++) {
                    System.out.print(i + "-");
                }
            } else if (num1 > num2) {
                for (int i = num2; i <= num1; i++) {
                    System.out.print(i + "-");
                }
            } else {
                System.out.println("Los números son iguales");
            } 

        } else {
            System.out.println("Alguno de los 2 números no son positivos");
        }
        System.out.println("");

    }
}
