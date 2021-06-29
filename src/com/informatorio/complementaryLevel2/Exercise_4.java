package com.informatorio.complementaryLevel2;

import java.util.ArrayList;
import java.util.List;
/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego
separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
ArrayList posee un método para particionar en sub-listas
 */
public class Exercise_4 {
    public static void main(String[] args) {
        List<String> studentsList = new ArrayList<>();

        listComplete(studentsList);

        System.out.println("\nDivision 1: " + studentsList.subList(0, 4));
        System.out.println("\nDivision 2: " + studentsList.subList(4, 8));
        System.out.println("\nDivision 3: " + studentsList.subList(8, 12));
    }

    private static void listComplete(List<String> studentsList) {
        studentsList.add("Pedro");
        studentsList.add("Juan");
        studentsList.add("Fernando");
        studentsList.add("Gaston");
        studentsList.add("David");
        studentsList.add("Analia");
        studentsList.add("Belen");
        studentsList.add("Flavia");
        studentsList.add("Ivana");
        studentsList.add("Priscila");
        studentsList.add("Pamela");
        studentsList.add("Damian");
    }
}