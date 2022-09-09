package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int ticket = 0;
        while (ticket != -1) {
            System.out.print("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            ticket = scanner.nextInt();
            if (ticket != -1) {
                System.out.print("How many round-trip tickets:  ");
                int RTticket = scanner.nextInt();
                Fare far = new Fare(ticket, RTticket);
                far.print();
            } else {
                break;
            }
         }
    }
}
