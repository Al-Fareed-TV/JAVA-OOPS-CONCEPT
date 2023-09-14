package org.example;

import java.util.Scanner;

public class BankApp {
    static int chooseTypeOfAccount(Scanner scanner){
        System.out.println("Select the type of account : \n1.Savings Account \n2.Fixed Account\n3.Back");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Options : \n1.Create Account\n2.Deposit Amount\n3.Withdraw amount\4.Exit");
        int ch = scanner.nextInt();
        switch (ch){
            case 1 : int opt = chooseTypeOfAccount(scanner);
            if(opt == 1){
                System.out.println("Enter the First Name : ");
                String firstName = scanner.next();
                System.out.println("Enter the Second Name : ");
                String secondName = scanner.next();
            } else if (opt == 2) {

            }else {

            }

        }
    }
}
