package org.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringOpsTest {

	@ParameterizedTest
	@ValueSource(strings = {"madam", "racecar", "radar", "able was I ere I saw elba"})
	void testIsPalindrome(String candidate) {
		assertTrue(StringOps.isPalindrome(candidate));
	}

}
