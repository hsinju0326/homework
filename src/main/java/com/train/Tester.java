package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets:  ");
        int RTticket = scanner.nextInt();
        Fare far = new Fare(ticket, RTticket);
        far.print();
    }
}
