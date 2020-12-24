package com.adventofcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Day11 {

    private final static int EXPECTED_SUM = 2020;

    private final Set<Integer> set;
    private final List<Integer> list;


    Day11(List<Integer> input) {
        this.list = input;
        this.set = new HashSet<>(list.size());
    }

    Long solve() {
        for (int current : list) {
            int lookFor = EXPECTED_SUM - current;
            if (set.contains(lookFor)) {
                return (long) (current * lookFor);
            } else {
                set.add(current);
            }
        }
        return null;
    }

}
