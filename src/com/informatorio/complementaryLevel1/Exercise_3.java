package com.informatorio.complementaryLevel1;

import java.util.Scanner;
/*
Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1) de manera escalonada
 */
public class Exercise_3 {
    public static void main(String[] args) {
        // Objeto scanner para tomar ingreso por consola
        Scanner input = new Scanner(System.in);

        // Aviso por pantalla
        System.out.print("Enter number: ");
        // Escanea el siguiente número ingresado
        int number = input.nextInt();

        // Finalizar el proceso de escaneo
        input.close();

        // Bucle para determinar la cantidad de renglones
        for (int i=1; i <= number+1 ; i++) {
            // Bucle para generar la suma de los números
            for (int j=1; j < i; j++) {
                // Salida por pantalla
                System.out.print(j + " ");
            }
            // Usado para hacer los escalones y salida pantalla
            System.out.println();
        }
    }
}
