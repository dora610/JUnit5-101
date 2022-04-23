/**
 * 
 */
package org.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author surajit
 *
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // per_method is default
@DisplayName("When runnig MathUtils")
class MathUtilsTest {

	MathUtils mathUtils;

	// in case of per_class static method is not required
	@BeforeAll
	void init() {
		mathUtils = new MathUtils();
	}

	@Nested
	@Tag("Math")
	@DisplayName("Add numbers")
	class AddTest {
		@Test
		@DisplayName("When adding two +ve nums")
		void testAddPositive() {
			Assumptions.assumeTrue(true);
			assertEquals(5, mathUtils.add(2, 3), "should be return sum");
		}

		@Test
		@DisplayName("When adding two -ve nums")
		void testAddNegative() {
			Assumptions.assumeTrue(true);
			assertEquals(-10, mathUtils.add(10, -20), "should be return sum");
		}
	}

	@RepeatedTest(5)
	@Tag("Math")
	void testSubstract(RepetitionInfo  info) {
		info.getCurrentRepetition();
		info.getTotalRepetitions();
		assertEquals(6, mathUtils.substract(14, 8), "Should substract two numbers");
	}

	@Test
	@Tag("Math")
	void testMultiplyTest() {
		assertAll(() -> assertEquals(10, mathUtils.multiply(2, 5)), () -> assertEquals(-10, mathUtils.multiply(-2, 5)),
				() -> assertEquals(0, mathUtils.multiply(0, 5)), () -> assertEquals(5, mathUtils.multiply(1, 5)));
	}

	@Test
	@Tag("Math")
	void testDivide() {
//		MathUtils mathUtils = new MathUtils();
		// passing lambda funtion instead of string itself when string generation is expensive
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), ()-> "Divide by 0 throws");
	}

	@Test
	@Tag("Circle")
	void testCalculateCircleArea() {
//		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.calculateCircleArea(10),
				"This should calculate circle area from radius");
	}

	@Test
	@Disabled("disabled until some bug has been resolved")
	void testDisable() {
		fail("This must fail");
	}
}
