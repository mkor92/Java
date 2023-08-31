package org.example;

import java.util.Arrays;
import java.util.Comparator;

import static org.example.PriceInput.*;


public class SortPrices {

    public static void sortPrices() {
        setTextHours();
        String[] sortedHoursArray = Arrays.copyOf(hoursArray, hoursArray.length);
        System.out.println(" ");
        Arrays.sort(sortedHoursArray, Comparator.comparingInt(s -> Integer.parseInt(s.split(" ")[1])));
        for (String s : sortedHoursArray) {
            System.out.println(s);
        }

        System.out.println(" ");
        Menu.menu();
    }


}
