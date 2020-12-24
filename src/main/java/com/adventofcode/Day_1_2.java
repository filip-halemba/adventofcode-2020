package com.adventofcode;

import java.util.*;

class Day_1_2 {

    private final static int EXPECTED_SUM = 2020;

    private final Set<Integer> set;
    private final List<Integer> list;


    Day_1_2(List<Integer> input) {
        this.list = input;
        this.set = new HashSet<>(list.size());
    }

    Long solve() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Integer lookFor = EXPECTED_SUM - (list.get(i) + list.get(j));
                if (set.contains(lookFor)) {
                    return (long) (lookFor * list.get(i) * list.get(j));
                } else {
                    set.add(list.get(i));
                }
            }
        }
        return null;
    }

}
