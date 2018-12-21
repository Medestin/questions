package com.medestin.check.permutation;

import java.util.Arrays;

public class PermutationChecker {

    public boolean checkPermutation(String one, String two){
        char[] arrayOne = stringToSortedArray(one);
        char[] arrayTwo = stringToSortedArray(two);

        for(int i = 0; i < arrayOne.length; ++i){
            if(!(arrayOne[i] == arrayTwo[i])){
                return false;
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
