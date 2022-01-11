package com.assignment.atm;

import java.util.Scanner;
public class Deposit
{
    int amt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        amt = scanner.nextInt();

        if(amt<=0)
        {
            InvalidTransaction depositnegativeError = new InvalidTransaction("Invalid Input");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }
        else
        {   
            return amt;
        }

        return amt;
        
    }

}