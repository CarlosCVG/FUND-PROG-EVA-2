/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
