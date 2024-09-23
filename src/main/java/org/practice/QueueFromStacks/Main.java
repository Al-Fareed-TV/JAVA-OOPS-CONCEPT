package org.QueueFromStacks;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int getQueueSize(){
        System.out.println("Enter the size of the Queue");
        return sc.nextInt();
    }
    static int getOptionFromMenu(){
        System.out.println("Choose an option :\n1.Push\n2.Pop\n3.Peek\n4.Exit");
        return sc.nextInt();
    }
    static int getElement(){
        System.out.println("Enter the element to be pushed : ");
        return sc.nextInt();
    }
    static void operations(int opt,Stacks stack){
        switch (opt){
            case 1: stack.push(getElement());
            break;
            case 2: stack.pop();
            break;
            case 3: stack.peek();
            break;
            case 4:
                System.out.println("\n--Terminating--\n");
                System.exit(0);
            default:
                System.out.println("Invalid option, Please choose from the below options");
        }
    }
    public static void main(String[] args) {
        int queueSize = getQueueSize();
        Stacks stack = new Stacks(queueSize);
        do{
            operations(getOptionFromMenu(),stack);
        }while(true);
    }
}