/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_32_arreglos_multidim;

/**
 *
 * @author 981010435
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

    public static void main(String[] args) {
        int [][] matriz = new int [3][4];
		matriz [0][3] = 100;
		
		System.out.println(matriz[0][3]);
		//llenar con valores aleatorios la matriz
		//Filas --> primer dimension
		
		for (int i = 0; i < matriz.length; i++){
		    //por cada fila debo de recorrer cada columna
		    //columnas:
		    for (int j = 0; j < matriz[i].length; j++){
		        matriz[i][j] = (int)(Math.random() * 100);
		    }
		}
		for (int i = 0; i < matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		        System.out.print("[" + matriz[i][j] + "]");
		    }
		    System.out.println("");
		}
    }
}
