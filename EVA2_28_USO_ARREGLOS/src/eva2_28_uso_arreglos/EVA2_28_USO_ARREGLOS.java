/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int cant, califa;
        int [] califas;//El arreglo sigue sin existir hasta que no se cree con NEW
        
        System.out.println("Cuantas calificaciones necesitas capturar?");
        cant = teclado.nextInt();
        
        califas = new int [cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresa la calificación");
            califa = teclado.nextInt();
            califas[i] = califa;
        }
        
        System.out.println("--------------------> Calificaciónes ingresadas:");
        
        for (int i = 0; i < cant; i++) {
            System.out.print("[" + califas[i] + "]");
        }
        System.out.println("");
    }
    
}
