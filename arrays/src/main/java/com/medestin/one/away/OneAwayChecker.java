package com.medestin.one.away;

public class OneAwayChecker {

    public boolean checkIfOneAway(String one, String two){
        int awayCounter = 0;
        char[] arrayOne = stringToArray(one);
        char[] arrayTwo = stringToArray(two);

        int lengthDifference = arrayOne.length - arrayTwo.length;

        if(lengthDifference == 1){
            for(int i = 0; i < arrayTwo.length; ++i){
                if(!(arrayOne[i + awayCounter] == arrayTwo[i])){
                    ++awayCounter;
                }
                if(awayCounter > 1){
                    return false;
                }
            }
        } else if (lengthDifference == -1){
            for(int i = 0; i < arrayOne.length; ++i){
                if(!(arrayOne[i] == arrayTwo[i + awayCounter])){
                    ++awayCounter;
                }
                if(awayCounter > 1){
                    return false;
                }
            }
        } else if (lengthDifference == 0){
            for(int i = 0; i < arrayTwo.length; ++i){
                if(!(arrayOne[i] == arrayTwo[i])){
                    ++awayCounter;
                }
                if(awayCounter > 1){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }


    private char[] stringToArray(String string){
        return string.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
    }
}
