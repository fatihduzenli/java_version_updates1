package com.cydeo.Task.Accounter;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        System.out.println("******Task-1************");
//1- Find all transactions in 2011 and sort by value

        TransactionData.getAll().stream()
                .filter(year -> year.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("******Task-2************");
        //2- What are all the unique cities where the traders work?

        TransactionData.getAll().stream()
                .map(p -> p.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("******Task-3************");
        //3- Find all traders from Cambridge and sort them by name

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("******Task-4************");
        //4- Return a string of all trader's names sorted alphabetically

    String result=    TransactionData.getAll().stream()
                .map(p -> p.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("List:",(x,y)-> x+y+" ");
        System.out.println(result);


        System.out.println("******Task-5************");
        //5- Are any traders based in Milan?

        boolean match=TransactionData.getAll().stream()
                .anyMatch(p-> p.getTrader().getCity().equals("Milan"));
        System.out.println(match);


        System.out.println("******Task-6************");
//6- Print the values of all transactions from the traders living in Cambridge


        TransactionData.getAll().stream()
                .filter(p -> p.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        System.out.println("******Task-7************");
//7 - What is the highest value of all the transactions

      Optional<Integer> a = TransactionData.getAll().stream()
                .map(Transaction::getValue)
               .reduce(Integer::max);
        System.out.println(a.get());

        System.out.println("******Task-8************");
        //8-Find the transaction with the smallest value
        Optional<Integer> min= TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(min.get());


    }
}
