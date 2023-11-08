/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, residuo, numInicial;
        String binario = "";

        System.out.println("Introduce el número a convertir a binario:");
        num = teclado.nextInt();
        numInicial=num;

        if (num >= 0) {
            while (num > 0) {
                residuo = num%2;
                num/=2;
                binario = residuo + binario;
            }
            System.out.println("El número " + numInicial + " en binario es " + binario);
        } else {
            System.out.println("El número no es válido");
        }
        System.out.println("");
    }
}
