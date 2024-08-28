package org.example;

import builders.IBuilder;
import domain.Address;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");



        Employee employee = new Employee.EmployeeBuilder()
                .setAge(22)
                .setName("Diego")
                .setGender("M")
                .setAddress(new Address("calle falsa 123", "Villavo", "CO", "500005"))
                .setAddress( "calle falsa 1233", "Villavo0", "CO", "500006")
                .build();
        //employee.setAge(3456);
        System.out.println(employee);
    }
}