package com.informatorio.complementaryLevel2;

import java.util.ArrayList;
import java.util.List;

/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de
un empleado. Se debe generar otra lista que contenga los totales
y luego imprimir el total final a cobrar.
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

Los arrays son iguales y corresponden a los días trabajados de
una semana Lun-Vie.
 */
public class Exercise_5 {
    public static void main(String[] args) {
        List<Integer> workingHours = new ArrayList<>();
        array1(workingHours);

        List<Integer> hourlyValue = new ArrayList<>();
        array2(hourlyValue);

        List<Integer> totals = new ArrayList<>();

        int counterTotal = 0;
        for (int i = 0; i < 5; i++) {
            totals.add(workingHours.get(i) * hourlyValue.get(i));
            counterTotal += totals.get(i);
        }

        System.out.println(totals);
        System.out.println("\nTotal final: $" + counterTotal);
    }

    private static void array2(List<Integer> hourlyValue) {
        hourlyValue.add(350);
        hourlyValue.add(345);
        hourlyValue.add(550);
        hourlyValue.add(600);
        hourlyValue.add(320);
    }

    private static void array1(List<Integer> workingHours) {
        workingHours.add(6);
        workingHours.add(7);
        workingHours.add(8);
        workingHours.add(4);
        workingHours.add(5);
    }
}
