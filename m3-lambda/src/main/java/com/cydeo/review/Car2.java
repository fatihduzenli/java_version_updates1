package com.cydeo.review;

public class Car2 {
    private String make;
    private int topSpeed;
    private int year;

    public static Car2Builder builder(){
        return new Car2Builder();
    }

    public static class Car2Builder{

        private String make;
        private int topSpeed;
        private int year;

        public Car2Builder(){

        }

    }
}
