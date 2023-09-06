package org.example;

import java.util.Scanner;


public class Menu {
    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("Elpriser");
            System.out.println("========");
            System.out.println("1. Inmatning");
            System.out.println("2. Min, Max och Medel");
            System.out.println("3. Sortera");
            System.out.println("4. Bästa Laddningstid (4h)");
            System.out.println("e. Avsluta");
            String menuInput = scanner.nextLine();

            switch (menuInput) {
                case "e", "E" -> {
                    System.out.println("Programmet avslutades");
                    System.exit(0);
                }
                case "1" -> {
                    if (!PriceInput.isPriceInput) {
                        PriceInput.priceInput();
                    } else {
                        System.out.println("\nDu har redan matat in dagens priser!\n");
                    }
                }
                case "2" -> {
                    if (PriceInput.isPriceInput) {
                        MinMax.minMax();
                    } else {
                        getMsg();

                    }
                }
                case "3" -> {
                    if (PriceInput.isPriceInput) {
                        SortPrices.sortPrices();
                    } else {
                        getMsg();

                    }
                }
                case "4" -> {
                    if (PriceInput.isPriceInput) {
                        ChargeTime.chargeTime();
                    } else {
                        getMsg();

                    }
                }
                default -> System.out.println(menuInput + " är inte ett giltigt val!");


            }
        }
    }

    public static void getMsg() {
        System.out.println("\nVänligen börja med att mata in dagens priser\n");
    }


}

