package codility_experiments.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

import codility_experiments.lesson4.FrogRiverOne;

public class FrogRiverOneTest {

	@Test
	public void shouldFindCorrectIndexWhenElementFoundOnce() {
		int[] testedArray = { 1, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(6, FrogRiverOne.solution(5, testedArray));
	}

	@Test
	public void shouldReturn_1WhenElementNotFound() {
		int[] testedArray = { 1, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(-1, FrogRiverOne.solution(6, testedArray));
	}
	
	@Test
	public void shouldFindCorrectIndexWhenElementFoundTwise() {
		int[] testedArray = { 1, 5, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(5, FrogRiverOne.solution(5, testedArray));
	}
	
	@Test
	public void shouldFindCorrectIndexWhenElementFoundThreetimes() {
		int[] testedArray = { 1, 3, 1, 3, 2, 1, 3};
		assertEquals(4, FrogRiverOne.solution(3, testedArray));
	}
}
