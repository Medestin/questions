package com.medestin;

import java.util.EmptyStackException;

public class MyStack<T> {
    private StackNode<T> top;

    public T pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> node = new StackNode<>(item);
        top.next = top;
        top = node;
    }

    public T peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        private StackNode(T data){
            this.data = data;
        }
    }
}
