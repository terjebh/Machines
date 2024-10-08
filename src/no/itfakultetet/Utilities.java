package no.itfakultetet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilities {

    public static List<Laptop> laptops = new ArrayList<>();

    public static Laptop leggTilLaptop() {

        Laptop laptop = new Laptop();

        System.out.println("Legg til ny Laptop");
        System.out.println("-".repeat(30));

        Scanner in = new Scanner(System.in);
        System.out.print("Merke: ");
        laptop.setBrand(in.nextLine());
        System.out.print("Pris: ");
        laptop.setPrice(Integer.valueOf(in.nextLine()));
        System.out.print("RAM (Gb): ");
        laptop.setMemory(Integer.valueOf(in.nextLine()));

        return laptop;


    }
}
