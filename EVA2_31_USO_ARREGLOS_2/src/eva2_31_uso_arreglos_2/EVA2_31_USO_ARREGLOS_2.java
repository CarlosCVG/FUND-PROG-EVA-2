/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_31_uso_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_31_USO_ARREGLOS_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner teclado = new Scanner(System.in);

      //Generar un arreglo de tamaño 15
      //Llenado con valores aleatorios entre 0 y 100
      int[] valores = new int[15];
      int num;
      for (int i = 0; i < valores.length; i++) {
         valores[i] = (int) (Math.random() * 100);
      }
      for (int i = 0; i < valores.length; i++) {
         System.out.print("[" + valores[i] + "]");
      }
      System.out.println("");
      System.out.println("Ingresa un número");
      num = teclado.nextInt();

      int posi = -1;
      //Busqueda del valor en el arreglo
      for (int i = 0; i < valores.length; i++) {

         if (num == valores[i]) {
            posi = i;
            break;
         }
      }
      if (posi != -1){
         System.out.println("El valor se encuentra en la posición " + posi + " del arreglo");
      } else {
         System.out.println("El valor no se encuentra en el arreglo");
      }
   }
}
