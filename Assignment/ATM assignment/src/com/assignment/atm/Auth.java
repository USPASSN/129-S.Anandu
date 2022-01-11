package com.assignment.atm;

import java.util.Scanner;
public class Auth{
    int ac_number = 98765432;
    int ac_pass = 7412;
    int ac;
    int pw;

    public void acceptInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Account Number:");
        ac = scanner.nextInt();

        System.out.println("Password:");
        pw = scanner.nextInt();

    }

    public void verify() throws Exception
    {
         
        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("Logged In!");

            Bank banking = new Bank();
            System.out.println(" ");
            System.out.println("Your Account Balance is: "+banking.getBalance()+"  Rupees");
            System.out.println(" ");
            Menu menu = new Menu();
            menu.showMenu();
        }
        else
        {
            InvalidTransaction loginfailed = new InvalidTransaction("Invalid Login!");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }


}