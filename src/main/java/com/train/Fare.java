package com.train;

public class Fare {
    int ticket;
    int RTticket;

    public Fare(int ticket, int RTticket) {
        this.ticket = ticket;
        this.RTticket = RTticket;
    }

    public void print() {
        System.out.println("Total tickets: " + ticket + "\n" + "Round-trip: " + RTticket +
                "\n" + "Total: " + ((ticket-RTticket)*1000+RTticket*2000*0.9));
    }
}
