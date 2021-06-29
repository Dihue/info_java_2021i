package com.informatorio.complementaryLevel1;

import java.util.Scanner;
/*
Se desea una aplicación que solicite 2 números enteros y realice la
operación de multiplicación por sumas sucecivas (sin uso de librerías)
*/
public class Exercise_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        input.close();

        int sum = 0;

        for (int i = 0; i < number2; i++) {
            sum = sum + number1;
        }
        System.out.println(number1 +" x " + number2 + " = " + sum);
    }
}
