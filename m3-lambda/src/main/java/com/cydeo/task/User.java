package com.cydeo.task;

import lombok.*;

@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data  // This annotation adds getter, setter, toString, NoArgConstructor(if we did not create any construction)
public class User {

    private String firstName;
    private String lastName;

    private int age;


}
