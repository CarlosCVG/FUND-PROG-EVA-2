/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num, sumatoria = 0;

        System.out.println("Introduce un número:");
        num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            sumatoria += i;
        }
        System.out.println("La sumatoria del 1 al número introducido es: " + sumatoria);

    }
}
