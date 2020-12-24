package com.adventofcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleTest {

	@ParameterizedTest
	@MethodSource("source")
	void boolean_equal_to_boolean(boolean left, boolean right) {
		assertThat(left).isEqualTo(right);
	}

	private static Stream<Arguments> source() {
		return Stream.of(
				Arguments.of(true, true),
				Arguments.of(false, false)
		);
	}

}
