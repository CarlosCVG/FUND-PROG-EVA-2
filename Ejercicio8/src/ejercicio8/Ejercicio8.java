/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String caracter;
        do {
            System.out.println("Introduce un caracter:");
            caracter = teclado.nextLine();
            
            if (caracter.length() != 0){
            switch (caracter.charAt(0)) {
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
                default:
                    System.out.println("Consonante");
            }
            }
        } while (caracter.length() != 0);
    }
    
}
