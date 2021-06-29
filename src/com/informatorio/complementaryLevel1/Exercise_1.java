package com.informatorio.complementaryLevel1;

import java.util.Scanner;
/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el
siguente mensaje "HOLA {USUARIO}
 */
public class Exercise_1 {
    public static void main(String[] args) {
        // Objeto scanner para tomar ingreso por consola
        Scanner input = new Scanner(System.in);

        // Aviso por pantalla
        System.out.print("Enter username: ");
        // Escanea la siguente palabra o cadena de palabras
        String name = input.nextLine();

        // Finalizar el proceso de escaneo
        input.close();

        // Salida por pantalla
        System.out.println("HOLA " + name.toUpperCase());
    }
}
