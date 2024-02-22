package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMember {

    public static void main(String[] args) {


        Person p1 = new Person("mike", 35, Gender.MALE);
        Person p2 = new Person("ozzy", 25, Gender.MALE);
        Person p3 = new Person("tom", 15, Gender.MALE);
        Person p4 = new Person("ally", 45, Gender.FEMALE);
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        CheckInterface verifying = person -> person.getAge() > 18 && Gender.MALE==person.getGender();


     verify(personList,person -> person.getAge() > 18 && Gender.MALE==person.getGender());
    }

    private static void verify(List<Person> personList, CheckInterface checkInterface) {
        List<Person> result = new ArrayList<>();

        for (Person eachPerson : personList) {
            if (checkInterface.check(eachPerson)) {
                result.add(eachPerson);
            }
        }
        System.out.println(result);
    }

}
