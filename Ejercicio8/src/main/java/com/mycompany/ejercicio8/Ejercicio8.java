/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char caracter;
        do {
            System.out.println("Introduce un caracter:");
            caracter = teclado.next().charAt(0);

            switch (caracter) {
                case 'a':
                    System.out.println("Vocal");
                    break;
                case 'A':
                    System.out.println("Vocal");
                    break;
                case 'e':
                    System.out.println("Vocal");
                    break;
                case 'E':
                    System.out.println("Vocal");
                    break;
                case 'i':
                    System.out.println("Vocal");
                    break;
                case 'I':
                    System.out.println("Vocal");
                    break;
                case 'o':
                    System.out.println("Vocal");
                    break;
                case 'O':
                    System.out.println("Vocal");
                    break;
                case 'u':
                    System.out.println("Vocal");
                    break;
                case 'U':
                    System.out.println("Vocal");
                    break;
                case ' ':
                    break;
                default:
                    System.out.println("Consonante");
            }
            
        } while (caracter != ' ');
    }
}

