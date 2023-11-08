/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String cadena;
        char caracter;
        int contador = 0;

        System.out.println("Introduce una cadena:");
        cadena = teclado.next();
        System.out.println("Introduce una letra:");
        caracter = teclado.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == caracter) {
                contador++;
            }
        }
        System.out.println("La letra " + caracter + " aparecio un total de " + contador + " veces en la cadena " + cadena);
    }

}
