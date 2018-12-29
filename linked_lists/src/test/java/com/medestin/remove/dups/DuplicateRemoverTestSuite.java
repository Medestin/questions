package com.medestin.remove.dups;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class DuplicateRemoverTestSuite {
    private DuplicateRemover remover = new DuplicateRemover();

    @Test
    public void testRemoveWithBufferWhenDuplicatesPresent(){
        LinkedList<Object> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("jan", "gosia", "marcin", "michal", "cos innego", "michal", "gosia"));

        assertEquals(5, remover.removeDuplicates(strings).size());
    }

    @Test
    public void testRemoveWithBufferWhenAllAreDuplicates(){
        LinkedList<Object> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("jan", "gosia", "marcin", "michal", "jan", "gosia", "marcin", "michal"));

        assertEquals(4, remover.removeDuplicates(strings).size());
    }

    @Test
    public void testRemoveWithBufferWithoutDuplicates(){
        LinkedList<Object> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("jan", "gosia", "marcin", "michal", "cos innego"));

        assertEquals(5, remover.removeDuplicates(strings).size());
    }

    @Test
    public void testRemoveWithBufferWhenEmptyList(){
        LinkedList<Object> strings = new LinkedList<>();

        assertEquals(0, remover.removeDuplicates(strings).size());
    }

    @Test
    public void testRemoveWithoutBufferWhenDuplicatesPresent(){
        LinkedList<Object> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("jan", "gosia", "marcin", "michal", "cos innego", "michal", "gosia"));

        assertEquals(5, remover.removeDuplicatesWithoutBuffer(strings).size());
    }

    @Test
    public void testRemoveWithoutBufferWhenAllAreDuplicates(){
        LinkedList<Object> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("jan", "gosia", "marcin", "michal", "jan", "gosia", "marcin", "michal"));

        assertEquals(4, remover.removeDuplicatesWithoutBuffer(strings).size());
    }

    @Test
    public void testRemoveWithoutBufferWithoutDuplicates(){
        LinkedList<Object> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("jan", "gosia", "marcin", "michal", "cos innego"));

        assertEquals(5, remover.removeDuplicatesWithoutBuffer(strings).size());
    }

    @Test
    public void testRemoveWithoutBufferWhenEmptyList(){
        LinkedList<Object> strings = new LinkedList<>();

        assertEquals(0, remover.removeDuplicatesWithoutBuffer(strings).size());
    }
}