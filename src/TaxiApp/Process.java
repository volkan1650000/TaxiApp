package TaxiApp;

import java.util.Scanner;

public class Process {
    Scanner scan = new Scanner(System.in);
    private double cost;


    public void setDistance(){
        System.out.println("How far are you going to go?");
        double km = scan.nextInt();
        while(km<0){
            System.out.println("Km cannot be negative!");
            System.out.println("Write again!");
            km = scan.nextInt();
        }
        cost = km/10;
    }



    public void setAge() {
        System.out.println("Your age?");
        int x = scan.nextInt();
        while(x<0){
            System.out.println("Age should be a positive number!");
            System.out.println("Write again!");
            x = scan.nextInt();
        }
        if (x < 12) {
            cost = cost / 2;
        } else if (x > 65) {
            cost = cost * 7 / 10;
        } else if (x > 24) {
            cost = cost * 9 / 10;
        }
    }



    public void setTravelType(){
        System.out.println("Choose what the travel type :\n1-Round trip ticket\n2-One way ticket");
        int x = scan.nextByte();
        while(x != 1 && x != 2) {
            System.out.println("Travel type should be either 1 or 2!");
            System.out.println("Write again!");
            x = scan.nextByte();
        }
        if (x == 1) {
            cost = cost * 16 / 10;
        }
    }



    public void getTotalCost () {
        System.out.println("The amount to be paid : "+cost);
        System.out.println("Good Traveling!");
    }

}
