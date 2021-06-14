package com.informatorio.classExercises;

import java.util.Scanner;
/*
Realizar una función que calcule el factorial de un número dado
 */
public class practical2 {
    public static void main(String[] args) {
        // Objeto scanner para tomar ingreso por consola
        Scanner input = new Scanner(System.in);

        // Aviso por pantalla
        System.out.println("Enter number:");
        // Escanea el siguiente número ingresado
        int number = input.nextInt();

        // Finalizar el proceso de escaneo
        input.close();

        // Salida por pantalla del método factorial
        System.out.println("The factorial of  " + number + " is equal to " + factorial(number));
    }

    private static int factorial(int number) {
        if (number == 0) {
            // Factorial de 0
            return 1;
        } else if (number == 1) {
            // Factorial de 1
            return 1;
        } else {
            // Factorial de cualquier número positivo
            return number * factorial(number-1);
        }
    }
}