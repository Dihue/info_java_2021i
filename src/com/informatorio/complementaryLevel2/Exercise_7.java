package com.informatorio.complementaryLevel2;

import java.util.ArrayList;
import java.util.List;

/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
nos devuelva un array de Strings. Con la secuencia de números enteros de principio
a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo
de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo
con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 */
public class Exercise_7 {
    public static void main(String[] args) {

        System.out.println(fizzBuzzFunction(1,5));
        System.out.println(fizzBuzzFunction(1,6));
        System.out.println(fizzBuzzFunction(1,8));
    }

    private static List<String> fizzBuzzFunction(int a, int b) {
        List<String> listNumber = new ArrayList<>();

        for (int i = a; i < b; i++) {
            String number = String.valueOf(i);

            if ( i % 2 == 0 && i % 3 == 0) {
                number = "FizzBuzz";
            }
            else if ( i % 2 == 0) {
                number = "Fizz";
            }
            else if ( i % 3 == 0) {
                number = "Buzz";
            }

            listNumber.add(number);
        }
        return listNumber;
    }
}
