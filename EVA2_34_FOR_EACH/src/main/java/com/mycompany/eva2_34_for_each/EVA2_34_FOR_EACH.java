/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_34_for_each;

/**
 *
 * @author 981010435
 */
public class EVA2_34_FOR_EACH {

    public static void main(String[] args) {
        int [] arreglo = new int [10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int)(Math.random()*100);
            
        }
        
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");  
        }
        
        System.out.println("");
        String mensaje[] = {"Hola", " ", "mundo", " ", "cruel!##!"};
        
        for (String valor : mensaje) {
            System.out.print(valor);
        }
    }
}
