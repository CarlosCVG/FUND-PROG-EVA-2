/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_promedio_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_PROMEDIO_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int cantCali, cali, suma = 0;
        
        System.out.println("Introduce el número de calificaciones a registrar: ");
        cantCali = teclado.nextInt();
        
        for (int i = 0; i < cantCali; i++) {
            System.out.println("Introduce la calificación:");
            cali = teclado.nextInt();
            
            //ACUMULADOR
            //suma = suma + cali;
            suma += cali;
        }
        
        //media = suma/cantCali;
        double media = suma / (cantCali * 1.0);
        //Si dividimos entre un entero el resultado sera entero
        System.out.println("El promedio de las calificaciones es: " + media);
    }
}
