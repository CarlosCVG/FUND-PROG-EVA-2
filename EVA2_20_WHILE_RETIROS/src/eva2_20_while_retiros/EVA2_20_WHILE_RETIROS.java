/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int canti = 1000;
        int retiro = 0;

        //Lo que sea VERDAD en el parentesis se va a repetir
        //si lo que esta en el parentesis es true, es verdad y nunca acabara de repetirse
        while (canti > 0) { //Infinito, ciclo que si no tiene un break no se va a detener
            System.out.println("Introduce la cantidad a retirar:");
            retiro = teclado.nextInt();
            canti -= retiro;
            System.out.println("Te quedan $" + canti + " pesos de saldo");
            
        }
       
    }
}
