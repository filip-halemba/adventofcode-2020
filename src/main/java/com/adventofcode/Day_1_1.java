package com.adventofcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Day_1_1 {

    private final static int EXPECTED_SUM = 2020;

    private final Set<Integer> input;


    Day_1_1(List<Integer> input) {
        this.input = new HashSet<>(input);
    }

    Long solve() {
        for (int current : input) {
            int lookFor = EXPECTED_SUM - current;
            if (input.contains(lookFor)) {
                return (long) (current * lookFor);
            }
        }
        return null;
    }

}
