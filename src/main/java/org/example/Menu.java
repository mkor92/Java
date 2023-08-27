package org.example;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elpriser");
        System.out.println("========");
        System.out.println("1. Inmatning");
        System.out.println("2. Min, Max och Medel");
        System.out.println("3. Sortera");
        System.out.println("4. Bästa Laddningstid (4h)");
        System.out.println("e. Avsluta");
        String menuInput = scanner.nextLine();

        if (menuInput.equals("e") || menuInput.equals("E")) {
            System.out.println("Programmet avslutades");
            System.exit(0);
        }
        else if (menuInput.equals("1")) {
            PriceInput.priceInput();
        }
        else if (menuInput.equals("2")) {
            System.out.println("Input is: " + menuInput);
        }
        else if (menuInput.equals("3")) {
            System.out.println("Input is: " + menuInput);
        }
        else if (menuInput.equals("4")) {
            System.out.println("Input is: " + menuInput);
        }
        else {
            System.out.println(menuInput + " är inte ett giltigt val!");

            menu();
        }
    }
}
