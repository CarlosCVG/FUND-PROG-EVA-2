/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_21_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int valor;

        //Asegura al menos una vez la ejecucion del ciclo
        do {
            System.out.println("Introduce un valor:");
            valor = teclado.nextInt();
        } while (valor != 100);

    }

}
