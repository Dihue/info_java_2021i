package com.informatorio.complementaryLevel2;

import java.util.ArrayList;
import java.util.List;
/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e
imprimir los elementos de la lista y el tamaño de la misma (antes y
después de agregar a en la primera y última posición).
 */
public class Exercise_2 {
    public static void main(String[] args) {

        List<Integer> listNumber = new ArrayList<>();

        originList(listNumber);

        for (Integer list1 : listNumber) {
            System.out.println(list1);
        }
        System.out.println("List size: " + listNumber.size());

        listNumber.add(0,0);
        listNumber.add(6789);

        for (Integer list2 : listNumber) {
            System.out.println(list2);
        }
        System.out.println("List size: " + listNumber.size());
    }

    private static void originList(List<Integer> listNumber) {
        listNumber.add(1234);
        listNumber.add(2345);
        listNumber.add(3456);
        listNumber.add(4567);
        listNumber.add(5678);
    }
}