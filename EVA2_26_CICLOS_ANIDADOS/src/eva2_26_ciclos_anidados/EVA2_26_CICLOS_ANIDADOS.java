/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_CICLOS_ANIDADOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
      int num;
      
      System.out.println("Introduce el número:");
      num = teclado.nextInt();
      
      for (int i = 1; i <= num; i++) {
         if (i!=1)
            System.out.println("");
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
      }
      System.out.println("");
      
      for (int i = num; i >= 1; i--) {
         if (i!=num)
            System.out.println("");
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
      }
      System.out.println("");
   }
   
}