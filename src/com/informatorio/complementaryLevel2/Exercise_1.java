package com.informatorio.complementaryLevel2;

import java.util.ArrayList;
import java.util.List;
/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
luego imprimir por pantalla el ranking
 */
public class Exercise_1 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        System.out.println("Ranking of favorite cities");
        rankingCities(cities);

        for (String city : cities) {
            System.out.println("#" + city);
        }
    }

    private static void rankingCities(List<String> cities) {
        cities.add("1 - Bariloche");
        cities.add("2 - Córdoba");
        cities.add("3 - Resistencia");
    }
}
