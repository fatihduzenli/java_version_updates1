package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }


    // we use a private method to call it inside the interface to another method;
    // it has to be private, so it won't be inherited to another class
    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }

}
