package com.cydeo.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State fl = new State();
        fl.addCity("Miami");
        fl.addCity("Naples");
        fl.addCity("Tampa");
        fl.addCity("Fort Myers");


        State me = new State();
        me.addCity("Portland");
        me.addCity("Bootbay Harbor");
        me.addCity("Bar Harbor");


        List<State>list =Arrays.asList(me,fl);

        list.stream()
                .map(State::getCity)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
