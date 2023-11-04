package TaxiApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }
    static void run(){
        Process pr = new Process();
        System.out.println("Welcome to the system!\n");

        pr.setDistance();

        pr.setAge();

        pr.setTravelType();

        pr.getTotalCost();
    }
}
