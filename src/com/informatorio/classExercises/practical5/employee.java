package com.informatorio.classExercises.practical5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.birthDay = LocalDate.parse(birthDay, formatter);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = Double.parseDouble(salary);
    }

    public employee(String firstName, String lastName, String birthDay, String salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthDay(birthDay);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return "employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                '}';
    }
}
