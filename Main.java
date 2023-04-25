package com.marnaf.project;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        System.out.println("Welcome to Ainaf library management software");
        Scanner input = new Scanner(System.in);

        String username = "Ainaf";
        String password = "AIU@a";

        String a = "Enter your password";
        String b = "Search book";
        String c = "denied";
        
       

        boolean continueLoop = true;

        while (continueLoop) {
        
             System.out.println("Enter username");
             String usn = input.nextLine();
             System.out.println("Enter password");
             String pwd = input.nextLine();

            if (usn.equals(username) && pwd.equals(password)) {
                
                while (true){
                System.out.println("Enter S to Search a book");
                System.out.println("Enter R to return a book");
                System.out.println("Enter B to borrow a book");
                
                String choice = input.nextLine();
                
             if(choice.equalsIgnoreCase("S")){
               
                 // handle book search logic
               System.out.println("You are searching a book");
               
             } else if(choice.equalsIgnoreCase("B")){
       
                //handle book borrow logic
               System.out.println("You are borrowing a book");
               
             }else if(choice.equalsIgnoreCase("R")){
              
               //handle book returnig logic
              System.out.println("You are returning a book");
             } else{
            
              System.out.println("Invalid input.please try again.");
                    continue;  
           
            } 
                System.out.println("Do you want to perform another action?(Y/N)");
                 
                String answer = input.nextLine();
          if(answer.equalsIgnoreCase("N")){
            
             continueLoop = false;
             
                break;
           }  
              
          }
               
            }

            
        }

       
    }

}