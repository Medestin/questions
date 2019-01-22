package com.medestin.queue.via.stacks;

import com.medestin.MyStack;

public class QueueViaStacks<T> {
    private final MyStack<T> orderedStack = new MyStack<>();
    private final MyStack<T> reversedStack = new MyStack<>();
    private boolean isReversed;

    public void add(T data){
        if(isReversed){
            reverse();
        }
        orderedStack.push(data);
    }

    public T remove(){
        if(!isReversed){
            reverse();
        }
        return reversedStack.pop();
    }

    public T peek(){
        if(!isReversed){
            reverse();
        }
        return reversedStack.peek();
    }

    public boolean isEmpty(){
        return (orderedStack.isEmpty() && reversedStack.isEmpty());
    }

    private void reverse(){
        if(isReversed){
            while(!reversedStack.isEmpty()){
                orderedStack.push(reversedStack.pop());
            }
            isReversed = false;
        } else {
            while (!orderedStack.isEmpty()) {
                reversedStack.push(orderedStack.pop());
            }
            isReversed = true;
        }
    }
}
