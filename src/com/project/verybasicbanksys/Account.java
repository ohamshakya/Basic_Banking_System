package com.project.verybasicbanksys;

public class Account {
   private String id;
   private String name;
    private int balance = 0;

    Account(String id,String name){
        this.id = id;
        this.name = name;
    }
    Account(String id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    //method used to add money
    public int credit(int amount){
        //adding amount to the balance
        balance += amount;
        return balance;
    }

    //method to deduct money
    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    //method used to transfer money
    public int transferTo(Account another,int amount){
        if(amount <= balance){
            amount = another.credit(amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "id = ["+getID()+" name = "+getName()+" balance ="+getBalance()+"]";
    }
}
