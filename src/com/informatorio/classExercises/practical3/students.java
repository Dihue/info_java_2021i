package com.informatorio.classExercises.practical3;
/*
Dado un archivo de texto, crear una función que lea todos los nombres
de los alumnos y los imprima por pantalla.
Cada línea del archivo representa el nombre de un alumno.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        // Constructor File con la ubicación del archivo a usar
        File list = new File("src\\com\\informatorio\\classExercises\\practical3\\students.txt");
        // Iniciar clase scanner
        Scanner scan;
        // Usado en caso de no encontrar el archivo a usar
        try {
            scan = new Scanner(list);
            // Bucle para ir leyendo línea a línea del archivo
            while (scan.hasNextLine()) { // hasNextLine indica si hay o no una línea para leer
                String line = scan.nextLine(); // nextLine devuelve la línea leida
                // Nueva clase scanner para extraer y manipular cada línea
                Scanner scan2 = new Scanner(line);
                // Salida por pantalla de la lista de alumnos
                System.out.println("Student: " + scan2.nextLine());
            }
            // Cerrar scanner
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
