package com.cydeo.Task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

         // print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        // print all phone numbers

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream()) // flat map always accepts stream of stream
                .forEach(System.out::println);

         // print all the phone numbers with double colon

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
