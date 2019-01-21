package com.medestin.stack.of.plates;

import com.medestin.MyStack;

public class SetOfStacks<T> {
    //for test purposes these are package-private
    MyStack<MyStack<T>> stackOfStacks = new MyStack<>();
    MyStack<T> currentStack = new MyStack<>();

    public void push(T item){
        if(currentStack.size() == 10){
            createNewStack();
        }
        currentStack.push(item);
    }

    public T pop(){
        checkAndUpdateCurrentStackIfEmpty();
        return currentStack.pop();
    }

    public T peek(){
        checkAndUpdateCurrentStackIfEmpty();
        return currentStack.peek();
    }

    public T popAt(int index){
        checkAndUpdateCurrentStackIfEmpty();
        if(index < 0 || index > stackOfStacks.size()){
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            return pop();
        } else {
            MyStack<MyStack<T>> tempStack = new MyStack<>();
            int currentIndex = 1;
            while(index != currentIndex){
                tempStack.push(stackOfStacks.pop());
                ++currentIndex;
            }
            T data = stackOfStacks.peek().pop();
            if(stackOfStacks.peek().isEmpty()){
                stackOfStacks.pop();
            }
            while(!tempStack.isEmpty()){
                stackOfStacks.push(tempStack.pop());
            }
            return data;
        }
    }

    private void createNewStack(){
        stackOfStacks.push(currentStack);
        currentStack = new MyStack<>();
    }

    private void checkAndUpdateCurrentStackIfEmpty(){
        if(currentStack.isEmpty()){
            currentStack = stackOfStacks.pop();
        }
    }
}
