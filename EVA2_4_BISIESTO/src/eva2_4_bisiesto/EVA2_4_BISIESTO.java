/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int year, residuo;
        
        System.out.println("Ingresa el año: ");
        year= teclado.nextInt();
        
        residuo = year % 4;
        if (residuo == 0){ // si es verdad si el año es divisible entre 4
            residuo = year%100;
            if (residuo == 0){ // si es verdad si el año es divisible entre 100
                residuo = year%400;
                if (residuo == 0){ //si es verdad que el año es divisible entre 400
                    System.out.println("El año es bisiesto");
                } else 
                    System.out.println("El año no es bisiesto");
            } else 
                System.out.println("El año es bisiesto");
        } else 
            System.out.println("El año no es bisiesto");
    }
    
}
