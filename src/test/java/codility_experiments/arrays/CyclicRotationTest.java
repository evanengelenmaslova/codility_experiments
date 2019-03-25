package codility_experiments.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void shouldRotateArray3Times() {
		int[] testArray = { 3, 8, 9, 7, 6 };
		int times = 3;

		int[] actualResult = CyclicRotation.solution(testArray, times);
		int[] expectedResult = { 9, 7, 6, 3, 8 };
		assertArrayEquals(expectedResult, actualResult);

	}

	@Test
	public void shouldRotateArray0s1Time() {
		int[] testArray = { 0, 0, 0 };
		int times = 1;

		int[] actualResult = CyclicRotation.solution(testArray, times);
		int[] expectedResult = { 0, 0, 0 };
		assertArrayEquals(expectedResult, actualResult);

	}

	@Test
	public void shouldPerformCompleteRotation() {
		int[] testArray = { 1, 2, 3, 4 };
		int times = 4;

		int[] actualResult = CyclicRotation.solution(testArray, times);
		int[] expectedResult = { 1, 2, 3, 4 };
		assertArrayEquals(expectedResult, actualResult);

	}

	@Test
	public void shouldRotateNegatives() {
		int[] testArray = { -1, -2, 0, -4, 4 };
		int times = 3;

		int[] actualResult = CyclicRotation.solution(testArray, times);
		int[] expectedResult = { 0, -4, 4, -1, -2 };
		assertArrayEquals(expectedResult, actualResult);

	}

	@Test
	public void shouldReturnEmptyOnEmpty() {
		int[] testArray = {};
		int times = 3;

		int[] actualResult = CyclicRotation.solution(testArray, times);
		int[] expectedResult = {};
		assertArrayEquals(expectedResult, actualResult);

	}

	@Test
	public void shouldReturnOriginalWhen0Rotatons() {
		int[] testArray = { 1, 2, 3 };
		int times = 0;

		int[] actualResult = CyclicRotation.solution(testArray, times);
		assertArrayEquals(testArray, actualResult);

	}

}
