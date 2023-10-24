/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class EVA2_13_TALLAS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int talla;
        System.out.println("Ingresa tu talla:");
        talla = teclado.nextInt();

        switch (talla) {
            case 29:
                System.out.println("Tu talla es Small");
                break;
            case 42:
                System.out.println("Tu talla es Medium");
                break;
            case 44:
                System.out.println("Tu talla es Large");
                break;
            case 48:
                System.out.println("Tu talla es XLarge");
                break;
            default:
                System.out.println("La talla " + talla + " no es válida");
        }
    }
}
