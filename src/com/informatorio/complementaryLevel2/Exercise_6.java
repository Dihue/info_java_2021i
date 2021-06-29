package com.informatorio.complementaryLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado
 */
public class Exercise_6 {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();
        Map<String,Integer> mapSalary = new HashMap<>();

        Employee emp1 = new Employee("Juan", "Perez", 1111,
                6, 350);
        Employee emp2 = new Employee("Maria", "Lopez", 2222,
                7, 550);
        Employee emp3 = new Employee("Damian", "Cuadra", 3333,
                8, 600);

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }

        mapSalary.put("DNI: "+emp1.getDni()+" $", emp1.salary());
        mapSalary.put("DNI: "+emp2.getDni()+" $", emp2.salary());
        mapSalary.put("DNI: "+emp3.getDni()+" $", emp3.salary());

        System.out.println("\n"+mapSalary);
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private int dni;
    private int workingHours;
    private int hourlyValue;

    public Employee(String firstName, String lastName, int dni, int workingHours, int hourlyValue) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.workingHours = workingHours;
        this.hourlyValue = hourlyValue;
    }

    @Override
    public String toString() {
        return "\nNombre y Apellido: "+this.firstName+" "+this.lastName+"\n DNI: "+this.dni+"\n Horas trabajadas: "+
                this.workingHours+"\n Valor por hora: "+this.hourlyValue;
    }

    public int salary() {
        return this.workingHours * this.hourlyValue;
    }

    public String getDni() {
        return String.valueOf(this.dni);
    }
}