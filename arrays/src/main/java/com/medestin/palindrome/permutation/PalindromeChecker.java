package com.medestin.palindrome.permutation;

import java.util.Arrays;

public class PalindromeChecker {

    public boolean checkIfPermutatedPalindrome(String string) {
        char[] chars = stringToSortedArray(string);

        if(chars.length % 2 == 0){
            for(int i = 0; i < chars.length -1; i += 2){
                if(!(chars[i] == chars[i+1])){
                    return false;
                }
            }
        } else {
            boolean foundSingledChar = false;
            int position = 0;
            while (position < chars.length -1){
                if(chars[position] == chars[position+1]){
                    position += 2;
                } else {
                    if(foundSingledChar){
                        return false;
                    } else {
                        foundSingledChar = true;
                        position += 1;
                    }
                }
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
