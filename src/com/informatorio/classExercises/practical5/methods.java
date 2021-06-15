package com.informatorio.classExercises.practical5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class methods {
    private static List<employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        read_Employee_List();

        System.out.println(employeeList);
    }

    private static void read_Employee_List() {
        String path = "src\\com\\informatorio\\classExercises\\practical5\\employees.txt";
        try (BufferedReader bR = new BufferedReader(new FileReader(path))) {
            String line = bR.readLine();
            while (line != null) {
                lineEmployee(line);
                line = bR.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lineEmployee(String lineList) {
        if (lineList != null) {
            String[] data = lineList.split(",");
            employee create = new employee(data[0], data[1], data[2], data[3]);

            employeeList.add(create);
        }
    }
}
