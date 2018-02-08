// Joseph Gildner
// CSCI 241
import java.util.*;

public class TestClient{
	public static void main(String[] args){
		CountingSorter countTest = new CountingSorter(9);
		int[] testAr = {12, 14, 19, 13, 27, 34, 21, 35};
		System.out.println(Arrays.toString(testAr));
		System.out.println(Arrays.toString(getLastDigits(testAr)));

		countTest.sort(testAr,getLastDigits(testAr));
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
