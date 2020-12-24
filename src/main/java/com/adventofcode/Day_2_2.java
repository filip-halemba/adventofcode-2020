package com.adventofcode;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Day_2_2 {

    static class Line {
        private static final Pattern PATTERN = Pattern.compile("(\\d+)-(\\d+) ([a-z]): ([a-z]+)");

        private final int firstIndex;
        private final int secondIndex;
        private final char character;
        private final String password;

        static Line of(String input) {
            Matcher matcher = PATTERN.matcher(input);
            if (matcher.find()) {
                return new Line(matcher);
            } else {
                throw new IllegalStateException("Illegal line = " + input);
            }
        }

        boolean valid() {
            char first = password.charAt(secondIndex);
            char second = password.charAt(firstIndex);
            if (first != character && second != character) {
                return false;
            } else {
                return first != character || second != character;
            }
        }

        private Line(Matcher matcher) {
            this.firstIndex = Integer.parseInt(matcher.group(1)) - 1;
            this.secondIndex = Integer.parseInt(matcher.group(2)) - 1;
            this.character = matcher.group(3).toCharArray()[0];
            this.password = matcher.group(4);
        }
    }

    private final List<Line> lines;

    Day_2_2(String input) {
        lines = Stream.of(input.split("\n"))
                      .map(Line::of)
                      .collect(Collectors.toList());
    }

    long solve() {
        return lines.stream()
                    .filter(Line::valid)
                    .count();
    }

}
