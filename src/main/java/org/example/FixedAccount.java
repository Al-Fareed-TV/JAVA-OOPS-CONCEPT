package org.example;

import java.util.List;

public class FixedAccount extends Account {
    private int numberOfYears;
    private List<Customer> customers;


    public FixedAccount(String accountNumber, double balance, int numberOfYears, List<Customer> customers) {
        super(accountNumber, balance,customers);
        this.numberOfYears = numberOfYears;
    }

    @Override
    public void createAccount(Customer newCustomer) {
        customers.add(newCustomer);
        setCustomers(customers);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (checkForWithdrawal(amount))
            setBalance(getBalance() - amount);
        else
            System.out.println("Can't withdraw money..");
    }

    @Override
    public boolean checkForWithdrawal(double amount) {
        return numberOfYears >= 5;
    }
}
