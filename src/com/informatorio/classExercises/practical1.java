package com.informatorio.classExercises;

import java.util.Scanner;
/*
Crear una función que realice la suma de 2 números dados
Aplicar estilo de cógido de Java y uso de funciones
*/
public class practical1 {
    public static void main(String[] args) {
        // Objeto scanner para tomar ingreso por consola
        Scanner input = new Scanner(System.in);

        // Aviso por pantalla
        System.out.println("Enter first number:");
        // Escanea el siguiente número ingresado
        int number1 = input.nextInt();

        // Aviso por pantalla
        System.out.println("Enter second number:");
        // Escanea el siguiente número ingresado
        int number2 = input.nextInt();

        // Finalizar el proceso de escaneo
        input.close();

        // Salida por pantalla del método sumar
        System.out.println("The result of sum is " + sumar(number1,number2));
    }

    private static int sumar(int number1, int number2) {
        return number1 + number2;
    }
}
