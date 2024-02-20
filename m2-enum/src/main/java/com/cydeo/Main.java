package com.cydeo;

public class Main {
    public static void main(String[] args) {


        System.out.println("How to access a constant ");


        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);


        System.out.println("How to get all the constants");


        Currency[] currencies = Currency.values();


        for (Currency currency : currencies) {
            System.out.println(currency); // we printed all currencies
        }


        System.out.println("How to use switch case with Enums");


        switch (Currency.PENNY) {
            case PENNY:
                System.out.println("Its 1 cent");
                break;
            case NICKLE:
                System.out.println("Its 5 cent");
                break;
            case DIME:
                System.out.println("Its 10 cents");
            case QUARTER:
                System.out.println("Its 25 cents");
        }

        calculate(3, 5, Operations.PLUS);

    }

    private static void calculate(double x, double y, Operations operation) {
        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
        }
    }


}
























