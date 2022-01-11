package com.assignment.atm;

public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Automated teller machine");
        System.out.println("Insert Card");
        System.out.println("Enter Details");
        Bank b = new Bank();
        b.initiate();
    }
}
