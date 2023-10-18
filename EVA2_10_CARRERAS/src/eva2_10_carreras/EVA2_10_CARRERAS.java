/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
      String inicial;
      //Solicitar el número de mes
      System.out.println("Ingresa las iniciales de tu carrera:");
      inicial = teclado.next();

      //if ((mes >= 1) && (mes <= 12)) {
      //   System.out.println("El mes " + mes + " es válido");
      switch (inicial) {
         case "ISC":
            System.out.println("Ingeniería en Sistemas Computacionales");
            break;
         case "INF":
            System.out.println("Ingenieria Informática");
            break;
         case "LA":
            System.out.println("Licenciatura en Administración");
            break;
         case "ARQ":
            System.out.println("Arquitectura");
            break;
         case "IND":
            System.out.println("Ingenieria Industrial");
            break;
         case "IDI":
            System.out.println("Ingenieria en Diseño industrial");
            break;
         case "IGE":
            System.out.println("Ingenieria en gestion empresearia");
            break;
         default:
            System.out.println("La carrera no es valida");
      }
   }
}
