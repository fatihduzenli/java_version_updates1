package com.cydeo;


import com.cydeo.java9.CompactStringDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {


        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56"); // 1.way of creating (We pass string inside the construction)
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56); // 2.way of creating (we pass double directly)
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;




        System.out.println(b1.subtract(b2));
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));

        //Scaling

        BigDecimal number1= new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1,RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));
        System.out.println(number1.setScale(4, RoundingMode.CEILING));

        // !!!!!!!!!!!!!!!!!!-- Do not use equals(). Use compareTo() --!!!!!!!!!!!!!!!!!!!!!

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal(2)));  // 0 means equal
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2"))); // 1 mean bigger
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2"))); // -1 means small

         // Testing module structure
        CompactStringDemo ASC = new CompactStringDemo();



    }
}
