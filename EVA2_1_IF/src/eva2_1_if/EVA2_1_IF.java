/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int calif;
        
        System.out.println("Menciona tu calificación:");
        calif = teclado.nextInt();
        
        if (calif >= 70){ //Es la expresión a evaluar
            //Esta parte del if siempre es la verdadera
            //no se usan llaves dentro del if si solo es una instrucción
            //Cuando se tienen 2 instrucciones se una llave
            System.out.println("Aprobaste: ganaste una felicitación"); //Pertenece al if sin llaves
            System.out.println("¡Felicidades!");
        } else //Significa "si no", ademas de ser opcional.
            //Misma forma del if, lleva llaves si son mas de una instrucción
            //else es para el falso
            System.out.println("Reprobaste: Volveras a cursar la materia");
            
        System.out.println("El programa ha acabado");
            
            //Si queremos que los dos mensajes estén dentro del if necesitan estar entre llaves
    }
    
}
