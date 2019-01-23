package com.medestin.sort.stack;

import com.medestin.MyStack;

public class SortStack {

    public static void sortStack(MyStack<Integer> stack){
        MyStack<Integer> temporaryStack = new MyStack<>();

        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!temporaryStack.isEmpty() && temporaryStack.peek() > temp){
                stack.push(temporaryStack.pop());
            }
            temporaryStack.push(temp);
        }
        while(!temporaryStack.isEmpty()){
            stack.push(temporaryStack.pop());
        }
    }
}
