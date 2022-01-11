package com.assignment.atm;


import java.util.Scanner;

public class Bank
{
    int amount = 10000;
     public void initiate()
    {
        Auth login = new Auth();
        try
        {
            login.acceptInput();
            login.verify();
            
        }
        catch(Exception e)
        {
            try{
                login.acceptInput();
                login.verify();
                
            }catch(Exception f)
            {
               
             }
        }
    }

    public int getBalance()
    {
        return amount;
    }

    public void add(int amt)
    {
        amount = amount + amt;
        System.out.println("Amount Credited!");
        System.out.println(" ");
        System.out.println("Available Balance: " +amount);
        System.out.println(" ");
    }

    public void withdrw(int amt)
    {
        System.out.println(" ");

        if(amount < amt)
        {
            InvalidTransaction invalidWithDraw = new InvalidTransaction("INSUFFICIENT BALANCE");
            System.out.println(invalidWithDraw.getMessage());
        }
        else
        {
            amount = (amount - amt);
            System.out.println("Collect your money: " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Total Balance: " +amount);
            System.out.println(" ");
        }
    }
}