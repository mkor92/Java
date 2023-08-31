package org.example;

import java.util.Arrays;

import java.util.Scanner;

public class PriceInput {
    public static int[] hours = new int[24];
    private static boolean isInitialized = false;
    public static boolean isPriceInput = false;
    public static String[] hoursArray;

    public static void priceInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nVänligen mata in dygnets elpriser i öre för varje timme");
        System.out.println("Separera priserna med mellanslag!");


        for (int i = 0; i < hours.length; i++) {
            hours[i] = scanner.nextInt();
            if (hours.length == 24) {
                isPriceInput = true;
            }
        }
        hoursArray = Arrays.stream(hours).mapToObj(String::valueOf).toArray(String[]::new);


        System.out.println("\nDagens priser är nu uppdaterade!");
        System.out.println(" ");

        Menu.menu();

    }


    public static void setTextHours() {

        if (!isInitialized) {
            for (int i = 0; i < hoursArray.length; i++) {
                hoursArray[i] = (i < 10 ? "0" + i + ":00-" : i + ":00-") + (i == 23 ? "00:00 " :
                        i < 9 ? "0" + (i + 1) + ":00 " : (i + 1) + ":00 ") + hoursArray[i] + " öre/kWh";

            }
        }

        isInitialized = true;
    }

}



