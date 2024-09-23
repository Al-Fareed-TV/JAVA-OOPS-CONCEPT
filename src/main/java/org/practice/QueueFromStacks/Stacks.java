package org.QueueFromStacks;

import java.util.ArrayList;
import java.util.List;

public class Stacks {
    private final int size;
    private List<Integer> stack;

    public Stacks(int size) {
        this.size = size;
        stack = new ArrayList<>(size);
    }
    public void push(int element){
        if(stack.size() < size){
            stack.add(element);
        }else{
            System.out.println("Queue is full");
        }
    }
    public void pop(){
        if(stack.isEmpty()){
            System.out.println("Queue is empty! add element");
        }else{
            Integer element = stack.removeFirst();
            System.out.println(element+" has bee popped out");
        }
    }
    public void peek(){
        if(stack.isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            System.out.println(stack.getFirst());
        }
    }
}
