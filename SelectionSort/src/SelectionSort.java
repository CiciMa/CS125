public class SelectionSort {
	// function to return the minimum of some arbitrary part of an aeeay of double
	
	public static int findIndexMin(double[] array, int lo, int hi) {
		// Base case: if only one element in our sublist, then return that value
		if (lo == hi) return lo;
		// recursive case, either the minimum is from the rest of the list
		// or it is our value
		int indexOfFromRest = findIndexMin(array, lo + 1, hi);
		if (array[lo] < array[indexOfFromRest]) {
			return lo;
		} else {
			return indexOfFromRest;
		}
	}
	public static void swap(double[] array, int posA, int posB) {
		double temp = array[posA];
		array[posA] = array[posB];
		array[posB] = temp;
	}
	
	
	public static double findMin(double[] array, int lo, int hi) {
		// Base case: if only one element in our sublist, then return that value
		if (lo == hi) return array[lo];
		// recursive case, either the minimum is from the rest of the list
		// or it is our value
		double minFromRest = findMin(array, lo + 1, hi);
		if (array[lo] < minFromRest) {
			return array[lo];
		} else {
			return minFromRest;
		}
	}
	
	
	// wrapper method hides our implementation of sort, adds a more convenient interface
	public static void sort(double[] array) {
		selectionSort(array, 0, array.length - 1);
	}
	
	private static void selectionSort(double[] array, int lo, int hi) {
//		int indexOfMin = findIndexMin(array, lo, hi);
//		swap(array, lo, indexOfMin);
		if (lo < hi) {
			swap(array, lo, findIndexMin(array, lo, hi));
			selectionSort(array, lo+1, hi);
		}
	}
 	 public static void main (String[] args) {
		 double[] data = {20, 21., 10., 15., 23.,56.};
		 System.out.println("The minimum of this array: " + findIndexMin(data, 0, data.length - 1 ));
		 
		 sort[data];
		 
		 for (int i=0; i < data.length; i++) {
			 System.out.println(data[i]);
		 }
	 }
}
