package com.assignment.atm;

import java.util.Scanner;
public class Menu
{
    int selectedOption;

    Bank banking = new Bank();

    public void showMenu()
    {
        System.out.println("Enter the options for further transaction:");
        System.out.println("Option 1: DEPOSIT MONEY.");
        System.out.println("Option 2: WITHDRAW MONEY.");
        System.out.println("Option 3: VIEW ACCOUNT BALANCE");
        System.out.println("Press any key to exit!:");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Press any key:");
        selectedOption = scanner.nextInt();


        switch (selectedOption)
         {
            case 1:
                 Deposit d = new Deposit();
                 int depamt =  d.userInput();

                 banking.add(depamt);

                 showMenu();

                break;
            case 2:
                 System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
                 int withamt=scanner.nextInt();
                 banking.withdrw(withamt);
                 showMenu();
                break;
            case 3:
                  System.out.println("YOUR ACCOUNT BALANCE: "+banking.getBalance()+" Rupees");
                  System.out.println(" ");  
                  showMenu();
                break;
        
            default:
                  System.out.println("TAKE THE CASH & REMOVE CARD!");
                  System.exit(0);
                break;
        }
        
    }

}