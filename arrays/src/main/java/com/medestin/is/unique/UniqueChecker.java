package com.medestin.is.unique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueChecker {

    public boolean checkUnique(String string){
        Set<Character> set = new HashSet<>();
        char[] chars = stringToSortedArray(string);

        for(char c : chars){
            if(set.contains(c)){
                return false;
            } else {
                set.add(c);
            }
        }
        return true;
    }

    private char[] stringToSortedArray(String string){
        char[] array = string.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        Arrays.sort(array);
        return array;
    }
}
