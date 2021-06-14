package com.informatorio.classExercises.practical4;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/*
Teniendo una lista de objetos empleados, cargar la misma en un archivo empleados.txt
Cada empleado se almacena en una línea con el formato a definir
 */
public class employees {
    public static void main(String[] args) {
        // Interface List con String e instanciando una nueva lista con una clase concreta "ArrayList"
        List<String> list = new ArrayList<>();
        // Cargar lista
        loadList(list);
        // Usado en caso de que no se escriba el archivo
        try {
            PrintWriter writer = new PrintWriter(
                    "src\\com\\informatorio\\classExercises\\practical4\\employees.txt","UTF-8");
            // Iterar los nombre y luego escribir
            for (String names : list) {
                writer.println(names);
            }
            // Cerrar writer
            writer.close();
            // Lista cargada con éxito
            System.out.println("List loaded with success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Lista de empleados
    private static void loadList(List<String> list) {
        list.add("Juan Perez");
        list.add("Alan Lopes");
        list.add("Pedro Gomez");
        list.add("Mateo Aguirre");
        list.add("Marcos Cruz");
        list.add("Gabriel Pons");
    }
}