package org.example;


import static org.example.PriceInput.hoursArray;
import static org.example.PriceInput.setTextHours;

public class ChargeTime {

    public static void chargeTime() {
        setTextHours();
        int consecutiveHours = 4;


        int cheapestSum = Integer.MAX_VALUE;
        String startHour = null;

        for (int i = 0; i <= hoursArray.length - consecutiveHours; i++) {
            int sum = 0;
            for (int j = i; j < i + consecutiveHours; j++) {
                sum += Integer.parseInt(hoursArray[j].split(" ")[1]);
            }
            if (sum < cheapestSum) {
                cheapestSum = sum;
                startHour = hoursArray[i].split("-")[0];
            }
        }


        System.out.println("\nDygnets " + consecutiveHours + " billigaste timmar i följd startar kl: " + startHour +
                " och har ett medelpris på " + cheapestSum / 4 + " öre/kWh");
        System.out.println(" ");
        Menu.menu();
    }

}

