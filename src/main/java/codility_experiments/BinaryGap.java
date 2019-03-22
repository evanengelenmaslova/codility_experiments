package codility_experiments;
import java.util.Arrays;
import java.util.TreeSet;

public class BinaryGap {

	public static int solution(int test) {
		int result = 0;
		
		TreeSet<Integer> counts = new TreeSet<>();
		
		char[] binaryTest = Integer.toBinaryString(test).toCharArray();
				
		int[] binary = new int[binaryTest.length];
	    Arrays.setAll(binary, i -> Character.getNumericValue(binaryTest[i]));
	    
	    
		int currentCount = 0;
		for (int i = 0; i < binary.length; i++) {
			int element = binary[i];
			if(element == 0){
				currentCount+=1;
			} else if(element == 1){
				counts.add(currentCount);
				currentCount = 0;
			}
		}
		result = counts.last();
		return result;
	}

}
