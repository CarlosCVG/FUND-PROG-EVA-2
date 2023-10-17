/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_7_ANIO_BISIESTO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
        int year, residuo4, residuo100, residuo400;
        
        System.out.println("Ingresa el año: ");
        year= teclado.nextInt();
        
        
        residuo4 = year % 4;
        residuo100 = year % 100;
        residuo400 = year % 400;
      if ((residuo4 == 0) && ((residuo100 != 0) || (residuo400 == 0)))
         System.out.println("El año " + year + " es bisiesto");
      else
         System.out.println("El año " + year + " no es bisiesto");
   }
}
