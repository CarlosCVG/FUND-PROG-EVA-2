/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_continue;

/**
 *
 * @author invitado
 */
public class EVA2_25_CONTINUE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      //continue interrumpe la iteración actual
      System.out.println("Uso del continue para saltarnos el 7");
      for (int i = 1; i < 15; i++) {
         if (i==7)
            continue;
         System.out.print(i + " - ");         
      }
      
      System.out.println("");
      System.out.println("Ejemplo del uso del Break");
      //break detiene por completo el ciclo
      for (int i = 1; i < 15; i++) {
         if (i==7)
            break;
         System.out.print(i + " - ");         
      }
      
      //imprimir los números que son pares entre el 1 y el 20
      System.out.println("");
      System.out.println("Números pares del 1 al 20");
      for (int i = 1; i <= 20; i++) {
         
         if ((i%2) != 0)
            continue;
         System.out.print(i + " - ");
         
      }
   }
   
}
