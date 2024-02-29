package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {
        //Zero Arg Constructor
        Supplier<Car> c1=()-> new Car();


        Supplier<Car> c2= Car::new; // ones we pass the Car class as return parameter we can just use double colon
                           // Constructor name is the class name, so we trigger constructor with new keyword
        System.out.println(c2.get().getMake());

        //All arg Constructor

        Function<Integer, Car> f1 = model -> new Car(model);
        Function<Integer,Car>f2 = Car::new;


        // Two Arg Construction
        BiFunction<String,Integer,Car> f3 = Car::new;
        Car honda =f3.apply("Honda",2014);

        System.out.println(honda.getMake()+" "+honda.getModel());


    }



}
