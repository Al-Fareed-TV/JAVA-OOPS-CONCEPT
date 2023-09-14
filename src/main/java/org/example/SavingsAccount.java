package org.example;

import java.util.List;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance,List<Customer> customerList) {
        super(accountNumber, balance,customerList);
    }

    List<Customer> customerList;
    @Override
    public void withdraw(double amount) {
        if (checkForWithdrawal(amount))
            setBalance(getBalance() - amount);
        else
            System.out.println("Insufficient Fund...");
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void createAccount(Customer newCustomer) {
        customerList.add(newCustomer);
        setCustomers(customerList);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
     public boolean checkForWithdrawal(double amount) {
        return getBalance() - amount >= 500;
    }
}
