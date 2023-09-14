package org.example;

import java.util.List;

public abstract class Account implements Operations {
    private String accountNumber;
    private double balance;
    List<Customer> customers;
    public Account(String accountNumber, double balance,List<Customer> customerList) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customers = customerList;
    }
    public abstract void createAccount(Customer customer);
    abstract void withdraw(double amount);
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public void deposit(double amount){
        balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
