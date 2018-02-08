// Joseph Gildner
// CSCI 241
import java.util.*;

public class TestClient{
	public static void main(String[] args){
		RadixSorter radixTest = new RadixSorter();
		CountingSorter countTest = new CountingSorter(9);
		int[] testAr = {122, 124, 319, 113, 227, 10000004, 321, 135};
		int[] testDigits = getLastDigits(testAr);
		radixTest.sort(testAr);
		System.out.println(Arrays.toString(testAr));
	}

	public static int[] getLastDigits(int[] vals){
		int[] lastDigits = new int[vals.length];
		for(int i=0; i<vals.length; i++){
			int thisDigit = vals[i] % ((vals[i]/10)*10);
			lastDigits[i] = thisDigit;
		}
		return lastDigits;
	}
}
