/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class EVA2_12_CALIFAS_EUA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calif;
        System.out.println("Ingresa tu calificación:");
        calif = teclado.nextInt();

        if ((calif > 100) || (calif < 0))
            System.out.println("Tu calificación no es válida");
        else if ((calif <= 100) && (calif >= 90))
            System.out.println("Tu calificación equivale a una: A");
        else if ((calif <= 89) && (calif >= 80))
            System.out.println("Tu calificación equivale a una: B");
        else if ((calif <= 79) && (calif >= 70))
            System.out.println("Tu calificación equivale a una: C");
        else if ((calif <= 69) && (calif >= 60))
            System.out.println("Tu calificación equivale a una: D");
        else
            System.out.println("Tu calificación equivale a una: F");    
    }
}
