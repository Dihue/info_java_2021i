package com.informatorio.complementaryLevel1;

import java.util.Scanner;
/*
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo
(resto de la división) de ambos números.
 */
public class Exercise_2 {
    public static void main(String[] args) {
        // Objeto scanner para tomar ingreso por consola
        Scanner input = new Scanner(System.in);

        // Aviso por pantalla
        System.out.print("Ingresar primer número entero: ");
        // Escanea el siguiente número ingresado
        int nro1 = input.nextInt();

        // Aviso por pantalla
        System.out.print("Ingresar segundo número entero: ");
        // Escanea el siguiente número ingresado
        int nro2 = input.nextInt();

        // Finalizar el proceso de escaneo
        input.close();

        // Salida por pantalla
        System.out.println(nro1 + " + " + nro2 + " = " + sum(nro1,nro2));
        System.out.println(nro1 + " - " + nro2 + " = " + subtraction(nro1,nro2));
        System.out.println(nro1 + " * " + nro2 + " = " + multiplication(nro1,nro2));
        System.out.println(nro1 + " / " + nro2 + " = " + division(nro1,nro2));
        System.out.println(nro1 + " % " + nro2 + " = " + module(nro1,nro2));
    }
    // Métodos
    private static int sum(int nro1, int nro2) {
        return nro1 + nro2;
    }

    private static int subtraction(int nro1, int nro2) {
        return nro1 - nro2;
    }

    private static int multiplication(int nro1, int nro2) {
        return nro1 * nro2;
    }

    private static int division(int nro1, int nro2) {
        return nro1 / nro2;
    }

    private static int module(int nro1, int nro2) {
        return nro1 % nro2;
    }
}