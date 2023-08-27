package org.example;

import java.util.Scanner;

public class PriceInput {
    public static void priceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vänligen mata in dygnets elpriser med start 00-01 och separera pricerna med ett kommatecken");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
    };
}
