package com.medestin.sort.stack;

import com.medestin.MyStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStackTestSuite {

    @Test
    public void testSortStack(){
        MyStack<Integer> stack = new MyStack<>();

        for(int i = 0; i < 10; ++i){
            stack.push((int)(Math.random()*100));
        }

        SortStack.sortStack(stack);

        for(int i = 0; i < 5; ++i){
            assertTrue(stack.pop() <= stack.pop());
        }
    }

}