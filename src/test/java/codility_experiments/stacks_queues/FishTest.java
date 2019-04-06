package codility_experiments.stacks_queues;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * We say that two fish P and Q meet each other when P < Q, B[P] = 1 and B[Q] =
 * 0, and there are no living fish between them
 * 
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [0..1,000,000,000]; each element of array B is an
 * integer that can have one of the following values: 0, 1; the elements of A
 * are all distinct.
 * 
 * @param A
 *            non empty array of N integers, N is an integer within the range
 *            [1..100,000]. All elements are distinct.
 * @param B
 *            non empty array of N integers, N is an integer within the range
 *            [1..100,000]. elements are either 0 or 1.
 * @return
 */
public class FishTest {

	@Test
	public void testExample() {
		int[] A = { 4, 3, 2, 1, 5 };
		int[] B = { 0, 1, 0, 0, 0 };
		assertEquals(2, Fish.solution(A, B));
	}

	@Test
	public void testExtremeLarge() {
		int[] A = { 0, 4, 3, 2, 1, 5, 1_000_000_000 };
		int[] B = { 0, 1, 0, 0, 0, 1, 1 };
		assertEquals(4, Fish.solution(A, B));
	}

	@Test
	public void testOnlyOneFish() {
		int[] A = { 4 };
		int[] B = { 0 };
		assertEquals(1, Fish.solution(A, B));
	}

	@Test
	public void testOnlyOneFish2() {
		int[] A = { 4 };
		int[] B = { 1 };
		assertEquals(1, Fish.solution(A, B));
	}

	@Test
	public void testOnlyTwoFish() {
		int[] A = { 4, 6 };
		int[] B = { 1, 0 };
		assertEquals(1, Fish.solution(A, B));
	}

	@Test
	public void testOnlyTwoFish2() {
		int[] A = { 6, 4 };
		int[] B = { 1, 0 };
		assertEquals(1, Fish.solution(A, B));
	}

	@Test
	public void testOnlyTwoFishReverse() {
		int[] A = { 4, 6 };
		int[] B = { 0, 1 };
		assertEquals(2, Fish.solution(A, B));
	}

	@Test
	public void testOnlyTwoFishReverse2() {
		int[] A = { 6, 4 };
		int[] B = { 0, 1 };
		assertEquals(2, Fish.solution(A, B));
	}

	@Test
	public void testOnlyUpstreamFish() {
		int[] A = { 4, 56, 7, 8 };
		int[] B = { 0, 0, 0, 0 };
		assertEquals(4, Fish.solution(A, B));
	}

	@Test
	public void testOnlyDownstreamFish() {
		int[] A = { 4, 56, 7, 8 };
		int[] B = { 1, 1, 1, 1 };
		assertEquals(4, Fish.solution(A, B));
	}

	@Test
	public void testExtremeSeparation() {
		int[] A = { 5, 3, 1, 0, 2, 6 };
		int[] B = { 1, 1, 1, 0, 0, 0 };
		assertEquals(1, Fish.solution(A, B));
	}

}
