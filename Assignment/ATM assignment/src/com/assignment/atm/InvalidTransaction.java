package com.assignment.atm;

public class InvalidTransaction extends Exception
{
     String errorMessage;
     public InvalidTransaction(String message)
     {
        errorMessage = message;
     }  

      public String getMessage()
      {
          return errorMessage;
      }
}