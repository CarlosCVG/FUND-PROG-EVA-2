/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        int num;
        String end;

        do {
            System.out.println("Introduce un número:");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("El número es negativo");
            } else if (num > 0) {
                System.out.println("EL número es positivo");
            } else {
                System.out.println("El número introducido es 0");
            }
            System.out.println("-------------");

            System.out.println("¿Quieres salir del programa?");
            System.out.println("Ingresa la letra s para salir, culaquier otra cosa para continuar.");
            end = teclado.next();

        } while (!end.equals("s"));
    }
}
