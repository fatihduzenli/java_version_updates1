package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Person {

    private String name;
    private int age;
    private Gender gender;


}
