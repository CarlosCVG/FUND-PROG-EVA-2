/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_30_USO_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
      String [] listaProd = new String[10];
      listaProd[0] = "Tacos";
      listaProd[1] = "Tortas";
      listaProd[2] = "Tamales";
      listaProd[3] = "Tlacoyos";
      listaProd[4] = "Tlayudas";
      listaProd[5] = "Tampiqueñas";
      listaProd[6] = "Tortas Ahogadas";
      listaProd[7] = "Tchilaquiles";
      listaProd[8] = "T-bone";
      listaProd[9] = "Tripas";
      //Si tenemos los datos previamente, se aconseja hacerlo de la siguiente manera:
      //String[] listaProd = {"Tacos", "Tamales", ...};
      
      double [] listaPrecios = {20,30,40,41,24,100,41,89,95,105};
      
      System.out.println("------>Menú<------");
      for (int i = 0; i < listaProd.length; i++) {
         System.out.println(i + " - " + listaProd[i] + ": $" + listaPrecios[i]);
      }
      
      int opc, cant;
      System.out.println("¿Qué deseas ordenar?");
      opc = teclado.nextInt();
      System.out.println("¿Cuántas órdenes?");
      cant = teclado.nextInt();
      System.out.println("La cantidad a pagar es de $" + (cant*listaPrecios[opc]) +" MXN");
   }
   
}
