package com.medestin.remove.dups;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DuplicateRemover {

    public LinkedList<?> removeDuplicates(LinkedList<?> list) {
        Set<Object> uniques = new HashSet<>(list);

        return new LinkedList<>(uniques);
    }

    public LinkedList<?> removeDuplicatesWithoutBuffer(LinkedList<?> list) {

        for(int i = 0; i < list.size(); ++i){
            for(int j = i+1; j < list.size(); ++j){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }

        return list;
    }
}
