/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int contador;

        do {
            contador = 0;
            System.out.println("Introduce un valor entero:");
            cadena = teclado.next();
            
            for (int i = 0; i < cadena.length(); i++) {
                switch(cadena.charAt(i)){
                case '0':
                    contador++;
                    break;
                case '1':
                    contador++;
                    break;
                case '2':
                    contador++;
                    break;
                case '3':
                    contador++;
                    break;
                case '4':
                    contador++;
                    break;
                case '5':
                    contador++;
                    break;
                case '6':
                    contador++;
                    break;
                case '7':
                    contador++;
                    break;
                case '8':
                    contador++;
                    break;
                case '9':
                    contador++;
                    break;
                }
            }
            if (contador != cadena.length()) {
                System.out.println("El valor no es un número entero");
            }
        } while (contador != cadena.length());
        
        System.out.println("EL número que introduciste fue " + cadena);
    }
}
