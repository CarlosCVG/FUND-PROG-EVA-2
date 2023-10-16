/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // OPERADOR(es) --> Son los símbolos que nos ejecutan alguna acción
        // SUMA --> +
        
        int suma, val1, val2;
        val1= 100;
        val2= 200;
        suma = val1 + val2; // Se realiza una suma aritmética
        System.out.println("\nLa suma da como resultado = " + suma); //Concatenación
        
        //RESTA --> -
        int resta;
        resta = val1 - val2;
        System.out.println("\nLa resta da como resultado = "+  resta);
        
        //MULTIPLICACIÓN --> *
        int multi;
        multi = val1 * val2;
        System.out.println("\nLa multiplicación da como resultado = "+  multi);
        
        //DIVISIÓN --> /
        int division;
        val1= 11;
        val2 = 2;
        division = val1 / val2;
        System.out.println("\nLa division da como resultado = " + division);
        
        //RESIDUO/MÓDULO --> %
        int residuo;
        residuo = val1 % val2;
        System.out.println("\nEl residuo de la división da como resultado = " + residuo);
        
        //----
        double resu;
        resu = val1/val2; //Resultado mostrado en Double, pero la operacion no
        System.out.println("\nLa division da como resultado = " + resu);
        
        double val2Double = 2;
        resu = val1 / val2Double;//Resultado correcto
        System.out.println("\nLa division da como resultado = " + resu);
        
        resu = 11/2.0; // resultado correcto
        System.out.println("\nLa division da como resultado = " + resu);
        
        /*
        int resu2 = 11/2.0; es incorrecto, no se puede añadir un double en un int
        System.out.println("\nLa division da como resultado = " + resu2);
        */
        
        //POTENCIA --> No existe un operador pero hay funciónes
        //Funciones con Math.
        //Floor es para redondear
        //Round para redondear tambien y que regrese un entero
        
        double potencia = Math.pow(3, 3);
        System.out.println("\n3 elevado a la 3 = " + potencia);
        
        //Raiz --> No existe un operador pero hay funciónes
        double raiz = Math.pow(100, .5);
        System.out.println("\nLa raiz cuadrada de 100 = " + raiz);
        
        //precedencia de operadores: 
        int resuOP, x = 3, y = 2, z =5;
        resuOP = (x * z) + (x * y) / 2 - (y - z);
        // (15) + (6)/2 - (-3)
        // 15 + 3 - (-3)
        // 15 + 3 + 3 = 21
        System.out.println("\nEl resultado de la operación es = " + resuOP);
        
        //FORMULA GENERAL:
        double resuFG, a = 3, b = 9, c = 3;
        resuFG = ((-b) - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2*a);
        // TAMBIÉN FUNCIONA: resuFG = ((-b) - Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a);
        System.out.println("\nEl resultado de la formula general es = " + resuFG);
        
        
    }
    
}
