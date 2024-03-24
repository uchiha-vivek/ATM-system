package com.atm;

import java.util.Scanner;

class ATM {

   float BALANCE =10000;
   int PIN=6863; 

   public void checkPin(){
    System.out.println("Enter your pin:");
    Scanner sc = new Scanner(System.in);

   int pin = sc.nextInt();
   
   // checking whether the pin is correct or not

     if(pin==PIN){
        menu();
     }
     else{
        System.out.println("Invalid Pin");
     }
}

public void menu(){
    System.out.println("Enter your choice :");
    System.out.println("1. Check your account balance :");
    System.out.println("2. Withdraw money");
    System.out.println("3. Deposit the  money");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();

    if(option==1){
        checkBalance();
    }
    else if(option==2){
        withdrawMoney();
    }
    else if(option==3){
        depositMoney();
    }
    else if(option ==4){
        return;
    }
    else{
        System.out.println("Enter a valid choice");
    }
}

public void checkBalance(){
    System.out.println("Your balance is "+ BALANCE);
    menu();
}

// withdrawing money
public void withdrawMoney(){
    System.out.println("Enter the money to be withdraw");
    Scanner sc = new Scanner(System.in);
    int amount =sc.nextInt();

    if (amount > BALANCE){
        System.out.println("Insufficient Balance");
    }
    else{
        BALANCE= BALANCE-amount;
        System.out.println("Money withdrawn successfully");
    }
    menu();
}

// deposit money
public void depositMoney(){
    System.out.println("Enter the money to be deposited");
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    BALANCE = BALANCE + amount;
    menu();
}

}





public class App 
{
    public static void main( String[] args )
    {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
