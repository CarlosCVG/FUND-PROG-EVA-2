/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, mayor = 0, menor = 0;
        
        do {
            System.out.println("Introduce un número:");
            num = teclado.nextInt();
            
            if (num >= mayor){
                mayor = num;
            } else if (num <= menor){
                menor = num;
            }

        } while (num > 0);
        System.out.println("El número mas grande introducido fue " + mayor);
        System.out.println("El número mas pequeño introducido fue " + menor);
    }
}
