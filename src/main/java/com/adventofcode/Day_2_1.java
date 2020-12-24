package com.adventofcode;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Day_2_1 {

    static class Line {
        private static final Pattern PATTERN = Pattern.compile("(\\d+)-(\\d+) ([a-z]): ([a-z]+)");

        private final int min;
        private final int max;
        private final String character;
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
            Matcher matcher = Pattern.compile(character).matcher(password);
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            return counter >= min && counter <= max;
        }

        private Line(Matcher matcher) {
            this.min = Integer.parseInt(matcher.group(1));
            this.max = Integer.parseInt(matcher.group(2));
            this.character = matcher.group(3);
            this.password = matcher.group(4);
        }
    }

    private final List<Line> lines;

    Day_2_1(String input) {
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
