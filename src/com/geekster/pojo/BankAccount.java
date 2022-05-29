package com.geekster.pojo;

import java.util.ArrayList;

public class BankAccount {

    private int customerId;
    private String customerName;
    private int balance;
    private int previousTransaction;
    private ArrayList<Integer> transactionHistory = new ArrayList<>();

    public int getCustomerId() {
        return customerId;

    }
    public String getCustomerName() {
        return customerName;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getPreviousTransaction() {
        return previousTransaction;
    }

    public BankAccount(String customerName, int customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void chekBalance(){
        System.out.println("Current balance is- "  + balance);
    }

    public void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            previousTransaction = amount;
            transactionHistory.add(amount);
        }else  {
            System.out.println("Please enter valid amount");
        }
    }
    public void getPreviousTransacation(){

        if (previousTransaction > 0){
            System.out.println("Deposited- "+ previousTransaction);
        }else if(previousTransaction < 0){
            System.out.println("Withdrawn- "+ Math.abs(previousTransaction));
        }else{
            System.out.println("No transacation");
        }

    }

    public void withdraw(int amount){
        if(amount > 0){
            if(balance < amount){
                System.out.println("Low balance can't withdraw");
            }else{
                balance = balance - amount;
                previousTransaction = -amount;
                transactionHistory.add(-amount);
            }
        }else {
            System.out.println("Please enter valid amount");
        }
    }

    public void getTransactionHistory(){
        for (int amnt : transactionHistory){
            if(amnt > 0){
                System.out.println("Credited- " + amnt);
            }else{
                System.out.println("Withdrawn- "+ Math.abs(amnt));
            }
        }
        System.out.println("Current balance is- "+ balance);
    }
}