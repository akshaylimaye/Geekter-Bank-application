package com.geekster.pojo;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Rishabh", 1);
        BankApplication obj = new BankApplication();
        obj.showMenu(user1);

    }


    public void showMenu(BankAccount user){

        int option = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome- "+ user.getCustomerName());
        System.out.println("Your Id is- "+ user.getCustomerId());

        do{
            System.out.println("**********************");
            System.out.println("Select an option");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Previous transaction");
            System.out.println("5. Transaction history");
            System.out.println("6. Exit");

            option = scan.nextInt();


            switch (option){
                case 1:
                    System.out.println("Balance = " + user.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposite- ");
                    int amount = scan.nextInt();
                    user.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw- ");
                    int withdrawAmount = scan.nextInt();
                    user.withdraw(withdrawAmount);
                    break;
                case 4:
                    user.getPreviousTransacation();
                    break;
                case 5:
                    user.getTransactionHistory();
                    break;
                case 6:
                    System.out.println("****************");
                    break;
                default:
                    System.out.println("Please select correct option-");
                    break;
            }

        }while(option != 6);

    }


}
