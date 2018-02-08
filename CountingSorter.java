// Joseph Gildner, W01395800
// February 7, 2018
// Assignment 1

import java.util.Arrays;
// This CountingSorter class is an implementation of the counting sort algorithm, meant to be used
// in tandem with the radix sort class 
public class CountingSorter{
	private int maxVal;
	// Constructs a new instance of the Counting Sorter with the max element in the
	// array to be sorted denoted as the parameter biggest
	public CountingSorter(int biggest){
		maxVal = biggest;
	}

	// Counting sort method, parameters are the original unsorted array of integers and the
	// Corresponding array of digits with which to sort
	public void sort(int[] value, int digit[]){
		//Initialize the countArray with all 0s
		int[] countArray = new int[maxVal+1]; //need a space to count each digit, including 0 (thus the +1)
		//Iterate through the count array, counting the occurences of each digit
		for(int i=0; i<digit.length; i++){
			countArray[digit[i]]++;
		}
		System.out.println(Arrays.toString(countArray));

	}
}