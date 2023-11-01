/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_DO_WHILE {
    final static String NOMBRE_USUARIO = "admin";
    final static String PASSWORD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario;
        String contra;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("------------------------------");
            System.out.println("Introduce el usuario:");
            usuario = teclado.next();
            System.out.println("Introduce la contraseña:");
            contra = teclado.next();
            
        } while ((!usuario.equals(NOMBRE_USUARIO)) || (!contra.equals(PASSWORD)));
        System.out.println("------------------------------");
        System.out.println("BIENVENIDO");
    }

    
}
