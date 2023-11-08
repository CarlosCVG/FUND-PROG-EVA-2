/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num, expo, resultado = 1;

        System.out.println("Introduce el número base:");
        num = teclado.nextInt();
        System.out.println("Introduce el exponente del número anterior:");
        expo = teclado.nextInt();

        if ((num >= 0) && (expo >= 0)) {
            for (int i = 1; i <= expo; i++) {
                resultado *= num;
            }
            System.out.println("El resultado de " + num + "^" + expo + " = " + resultado);
        } else {
            System.out.println("Alguno de los 2 números no es positivos");
        }
        System.out.println("");
    }
}
