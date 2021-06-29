package com.informatorio.complementaryLevel1;

import java.util.Scanner;

/*
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x ... x (n-1) x n
Sin hacer uso de librerías
 */
public class Exercise_4 {
    public static void main(String[] args) {
        // Objeto scanner para tomar ingreso por consola
        Scanner input = new Scanner(System.in);

        // Aviso por pantalla
        System.out.print("Enter number: ");
        // Escanea el siguiente número ingresado
        int number = input.nextInt();

        // Finalizar el proceso de escaneo
        input.close();

        // Salida por pantalla
        System.out.println("The factorial of " + number + " is equal to " +
                factorial(number));
    }

    // Método
    private static int factorial(int number) {
        // Bucle para las distintas entradas
        if (number == 0) {
            // factorial de 0 es 1
            return 1;
        } else if (number == 1) {
            // factorial de 1 es 1
            return 1;
        } else {
            // factorial para cualquier número positivo
            return number * factorial(number-1);
        }
    }
}
