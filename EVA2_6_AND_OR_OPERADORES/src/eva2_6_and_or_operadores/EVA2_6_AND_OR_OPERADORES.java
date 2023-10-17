/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_and_or_operadores;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
      int calif;

      //CAPTURAR LA CALIFICACIÓN
      System.out.println("Ingresa tu calificación: ");
      calif = teclado.nextInt();

      //EVALUAR:
      //EJEMPLO = 40 --> Es verdad que es mayor o igual a cero y menor o iugla a 100
      /*
       Tabla de verdad de AND
       V AND V = V
       V AND F = F
       F AND V = F
       F AND F = F
       */
      if ((calif >= 0) && (calif <= 100)) {
         System.out.println("La calificación " + calif + " es válida para el sistema");
         if (calif >= 70) {
            System.out.println("Felicidades, aprobaste");
         } else {
            System.out.println("Fallaste, tendras que recursar");
         }
      } else {
         System.out.println("La calificación " + calif + " NO es válida");
      }
   }
}
