/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num = 100;
        int captu = 0;

        //Lo que sea VERDAD en el parentesis se va a repetir
        //si lo que esta en el parentesis es true, es verdad y nunca acabara de repetirse
        while (true) { //Infinito, ciclo que si no tiene un break no se va a detener
            System.out.println("Introduce un número:");
            captu = teclado.nextInt();
            if (captu == num) {
                System.out.println("Adivinaste");
                break; //ROMPER--> Detiene la ejecución del ciclo
            }
        }
    }

}
