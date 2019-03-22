package codility_experiments;

import static org.junit.Assert.*;

import org.junit.Test;
import static codility_experiments.BinaryGap.solution;
public class BinaryGapTest {

	@Test
	public void shouldReturn1ForInt20() {
		assertEquals(1, solution(20));
	}
	
	@Test
	public void shouldReturn4ForInt529 () {
		assertEquals(4, solution(529));
	}
	
	@Test
	public void shouldReturn0ForInt15 () {
		assertEquals(0, solution(15));
	}
	
	@Test
	public void shouldReturn2ForInt9 () {
		assertEquals(2, solution(9));
	}

}
