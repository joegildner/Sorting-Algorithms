// Joseph Gildner, W01395800
// February 7, 2018
// Assignment 1

// The RadixSorter class is designed to implement a radix sort on a given array of integers. The 
// Radix sort is done starting from the least significant digit and then 
public class RadixSorter{
	// countSort will be used to sort digits in ascending order via counting sort
	private CountingSorter countSort;

	// constructs a new instance of the RadixSorter
	public RadixSorter(){
		countSort = new CountingSorter(9);
	}

	// the radix sorting method itself, takes an unsorted array of integers and sorts them
	public void sort(int[] list){

	}

}