package org.example;

import java.util.Arrays;

import static org.example.PriceInput.*;

public class MinMax {

    public static void minMax() {

        setTextHours();
        Arrays.sort(hours);
        String min = String.valueOf(hours[0]);
        String max = String.valueOf(hours[23]);
        String average = "";

        for (int i = 0; i < hours.length; i++) {
            if (hoursArray[i].split(" ")[1].equals(min)) {
                min = hoursArray[i];
            } else if (hoursArray[i].split(" ")[1].equals(max)) {
                max = hoursArray[i];
            }
        }
        int total = 0;
        for (int hour : hours) {
            total = total + hour;
            average = total / hours.length + " öre/kWh";
        }

        System.out.println("\nDagens lägsta pris: " + min);
        System.out.println("Dagens högsta pris: " + max);
        System.out.println("\nMedelpris för dagen: " + average);
        System.out.println(" ");

        Menu.menu();
    }
}
