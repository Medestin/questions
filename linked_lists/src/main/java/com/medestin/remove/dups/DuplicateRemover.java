package com.medestin.remove.dups;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.IntStream;

public class DuplicateRemover {

    public LinkedList<?> removeDuplicates(LinkedList<?> list) {
        Set<Object> uniques = new HashSet<>(list);

        return new LinkedList<>(uniques);
    }

    public LinkedList<?> removeDuplicatesWithoutBuffer(LinkedList<?> list) {

        IntStream.range(0, list.size() - 1)
                .forEach(i -> IntStream.range(i + 1, list.size())
                        .forEach(n -> {
                            for (int j = n; j < list.size(); ++j) {
                                if (list.get(i).equals(list.get(j))) {
                                    list.remove(j);
                                }
                            }
                        }));
        return list;
    }
}
