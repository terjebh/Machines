package no.itfakultetet;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        while(true) {
            System.out.println("Meny");
            System.out.println("-".repeat(20));
            System.out.println("1. Legg til ny Laptop");
            //TODO Add functionality for menu choice 2
            System.out.println("2. Legg til ny Maskin");
            System.out.println("3. Vis alle Laptopper");
            System.out.println("q. Avslutt");

            Scanner menyvalg = new Scanner(System.in);
            String valg = menyvalg.nextLine();
            switch (valg) {
                case "q" -> {
                    System.out.println("Bye...");
                    menyvalg.close();
                    System.exit(0);
                }
                case "1" -> {
                    Laptop laptop = Utilities.leggTilLaptop();
                    Utilities.laptops.add(laptop);
                }
                case "3" -> {
                    if (!Utilities.laptops.isEmpty()) {
                        System.out.println("-".repeat(40));
                        System.out.println("Oversikt over Laptopper");
                        System.out.println("-".repeat(40));
                        Utilities.laptops.forEach(l -> System.out.println("Merke:" + l.getBrand() + " Minne: " + l.getMemory() + " Gb. Pris: " + l.getPrice()));
                        System.out.println("-".repeat(40));
                    } else {
                        System.out.println("Det er ingen laptopper på listen");
                    }
                }
            }
        }

    }


}
