package codility_experiments.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

import codility_experiments.lesson4.PermCheck;

public class PermCheckTest {

	@Test
	public void shouldIndicateArrayIsPermutation() {
		int[] testedArray = {4 , 1 , 3 , 2};
		assertEquals(1, PermCheck.solution(testedArray));
	}
	
	@Test
	public void shouldIndicateArrayIsNotPermutation() {
		int[] testedArray = {4 , 1 , 3 , 2, 6};
		assertEquals(0, PermCheck.solution(testedArray));
	}

}
