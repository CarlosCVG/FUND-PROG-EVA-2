/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class EVA2_10_CARRERAS {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String siglas;
        System.out.println("Ingresa las siglas de tu carrera:");
        siglas = teclado.next();

        switch (siglas) {
            case "ISC":
                System.out.println("Ingeniería en Sistemas Computacionales");
                break;
            case "INF":
                System.out.println("Ingeniería Informática");
                break;
            case "LA":
                System.out.println("Licenciatura en Administración");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            case "IND":
                System.out.println("Ingeniería Industrial");
                break;
            case "IDI":
                System.out.println("Ingeniería en Diseño Industrial");
                break;
            case "IGE":
                System.out.println("IngenierÍa en Gestión Empresearia");
                break;
            default:
                System.out.println("La sigla " + siglas + " no es válida");
        }
    }
}
