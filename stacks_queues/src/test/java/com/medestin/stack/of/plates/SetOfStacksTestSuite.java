package com.medestin.stack.of.plates;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetOfStacksTestSuite {

    @Test
    public void testPush(){
        SetOfStacks<Integer> setOfStacks = new SetOfStacks<>();

        for(int i = 0; i < 10; ++i){
            setOfStacks.push((int)(Math.random()*100));
        }
        assertTrue(setOfStacks.stackOfStacks.isEmpty());
        assertEquals(10, setOfStacks.currentStack.size());

        for(int i = 0; i < 10; ++i){
            setOfStacks.push((int)(Math.random()*100));
        }
        assertEquals(1, setOfStacks.stackOfStacks.size());
        assertEquals(10, setOfStacks.currentStack.size());
    }


    @Test
    public void testPop(){
        SetOfStacks<Integer> setOfStacks = new SetOfStacks<>();
        for(int i = 0; i < 9; ++i){
            setOfStacks.push((int)(Math.random()*100));
        }
        setOfStacks.push(24);
        setOfStacks.push(55);
        assertEquals(55, (int) setOfStacks.pop());
        assertEquals(24, (int) setOfStacks.pop());
    }

    @Test
    public void testPopAt(){
        SetOfStacks<Integer> setOfStacks = new SetOfStacks<>();
        for(int i = 0; i < 19; ++i){
            setOfStacks.push((int)(Math.random()*100));
        }
        setOfStacks.push(55);
        for(int i = 0; i < 40; ++i){
            setOfStacks.push((int)(Math.random()*100));
        }
        assertEquals(55, (int) setOfStacks.popAt(4));
    }
}