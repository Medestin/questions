package com.medestin.queue.via.stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueViaStacksTestSuite {

    @Test
    public void testQueueViaStacks(){
        QueueViaStacks<Integer> queue = new QueueViaStacks<>();
        queue.add(2350);
        queue.add(2351);
        queue.add(2352);
        queue.add(2353);
        for(int i = 0; i < 9; ++i){
            queue.add((int)(Math.random()*100));
        }

        assertArrayEquals(new int[]{2350, 2351},
                new int[]{queue.remove(), queue.remove()});

        for(int i = 0; i < 9; ++i){
            queue.add((int)(Math.random()*100));
        }

        assertArrayEquals(new int[]{2352, 2353},
                new int[]{queue.remove(), queue.remove()});
    }
}