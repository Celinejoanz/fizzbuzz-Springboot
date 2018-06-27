package com.example.fizzbuzz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


public class FizzBuzz {

    @Min(0)
    private Integer startingNumber;

    @Min(0)
    @Max(100)
    private Integer endingNumber;

    public Integer getStartingNumber() {
        return startingNumber;
    }

    public void setStartingNumber(Integer startingNumber) {
        this.startingNumber = startingNumber;
    }

    public Integer getEndingNumber() {
        return endingNumber;
    }

    public void setEndingNumber(Integer endingNumber) {
        this.endingNumber = endingNumber;
    }
}
//    public ArrayList<String> Method() {
//        ArrayList<String> fizzbuzz = new ArrayList<>();
//        String output = "";
//        Integer max = 100;
//        Integer min = 1;
//        Integer i;
//        //fizzbuzz.setStartingNumber(min);
//       // fizzbuzz.setEndingNumber(max);
//
//        for (i = min; i <= max; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                fizzbuzz.add("FizzBuzz");
//            } else if (i % 5 == 0) {
//                fizzbuzz.add("Buzz");
//            } else if (i % 3 == 0) {
//                fizzbuzz.add("Fizz");
//            } else fizzbuzz.add(i.toString());
//        }
//        return fizzbuzz;
//    }
//}
