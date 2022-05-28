package com.geekster.pojo;

public class BankAccount {

    private int customerId;
    private String customerName;
    private Integer balance;
    private Integer previousTransaction;

    public BankAccount(String customerName, int customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void chekBalance(){
        System.out.println("Current balance is- "  + balance);
    }

    public void deposite(int amount){
        if(amount > 0){
            balance = balance + amount;
        }else  {
            System.out.println("Please enter valid amount");
        }
    }
    public void getPreviousTransacation(){

    }

    public void withdraw(int amount){
        if(amount > 0){
            if(balance < amount){
                System.out.println("Low balance can't withdraw");
            }else{
                balance = balance - amount;
            }
        }else {
            System.out.println("Please enter valid amount");
        }
    }
}