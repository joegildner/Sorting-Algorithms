// Joseph Gildner, W01395800
// February 7, 2018
// Assignment 1
import java.util.Arrays;
// The RadixSorter class is designed to implement a radix sort on a given array of integers. The 
// Radix sort is done starting from the least significant digit and then 
public class RadixSorter{
	private CountingSorter countSort; // will be used to sort digits in ascending order via counting sort
	
	// constructs a new instance of the RadixSorter
	public RadixSorter(){
		countSort = new CountingSorter(9); // constructs instance of the CountingSorter class
	}

	// the radix sorting method itself, takes an unsorted array of integers and sorts them
	public void sort(int[] list){
		boolean hasRemainingDigits = true;		// Flag to determine whether sorting needs to continue or not
		int currentDigit = 0;					// Keeps track of which digit is being sorted, 0 for least significant

		// While loop will continue to sort on each successive digit until all digits have been sorted
		while(hasRemainingDigits){
			int[] digitArray = new int[list.length]; 	// array to hold the desired digit from every number in the list

			hasRemainingDigits = getDigitArray(list,digitArray,currentDigit); // This line both determines whether there are digits remaining and fills the digit array with the current digit
			// This midloop check will keep the program from running count sort when it is unnecessary.
			if(!hasRemainingDigits){
				break;
			}
			countSort.sort(list,digitArray); // Uses the CountingSorter class to sort the list by desired digit

			currentDigit++;
		}
	}

	public boolean getDigitArray(int[] list, int[] digitArray,int currentDigit){
		boolean digitsRemaining = false;

		for(int i=0; i<list.length; i++){
			int divPow = (int)Math.pow(10,currentDigit);
			int thisDigit = list[i] / divPow;
			if((thisDigit/10)*10 > 0){
				thisDigit = thisDigit % ((thisDigit/10)*10);
				digitsRemaining = true;
			}else if(thisDigit>0){
				digitsRemaining = true;
			}
			digitArray[i] = thisDigit;
		}
		return digitsRemaining;
	}

}