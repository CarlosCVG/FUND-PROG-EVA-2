/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
      int mes;
      //Solicitar el número de mes
      System.out.println("Ingresa el número de mes:");
      mes = teclado.nextInt();

      //if ((mes >= 1) && (mes <= 12)) {
      //   System.out.println("El mes " + mes + " es válido");
      switch (mes) {
         case 1:
            System.out.println("ENERO");
            break;
         case 2:
            System.out.println("FEBRERO");
            break;
         case 3:
            System.out.println("MARZO");
            break;
         case 4:
            System.out.println("ABRIL");
            break;
         case 5:
            System.out.println("MAYO");
            break;
         case 6:
            System.out.println("JUNIO");
            break;
         case 7:
            System.out.println("JULIO");
            break;
         case 8:
            System.out.println("AGOSTO");
            break;
         case 9:
            System.out.println("SEPTIEMBRE");
            break;
         case 10:
            System.out.println("OCTUBRE");
            break;
         case 11:
            System.out.println("NOVIEMBRE");
            break;
         case 12:
            System.out.println("DICIEMBRE");
            break;
         default:
            System.out.println("El mes " + mes + " no es válido");
      }            
   }
   
}
