package com.medestin.is.unique;

import java.util.HashSet;
import java.util.Set;

public class UniqueChecker {
    private final Set<Character> alphabetSet = new HashSet<>();

    public UniqueChecker() {
        for(char c : "abcdefghijklmnopqrst".toCharArray()){
            this.alphabetSet.add(c);
        }
    }

    public boolean checkUnique(String string){
        String lowercasedString = string.toLowerCase();

        long count = alphabetSet.stream().filter(character -> lowercasedString.contains(character.toString())).count();
        return count == alphabetSet.size();
    }
}
