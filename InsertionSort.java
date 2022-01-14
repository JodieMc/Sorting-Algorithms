package ie.gmit.dip.algorithms;

public class InsertionSort extends Algorithm {
    public InsertionSort() {
        algorithmName = "InsertionSort";
    }

     /*
        Insertion Sort. Code source: Lecture notes(Sorting Algorithms 2, Mannion, P.(2021))
        Insertion Sort is an in-place, comparison based, stable sorting algorithm with n in the
        best, and 𝑛^2 in the worst and average cases of time complexity
     */

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { //Loop over the array starting at index 1
            int key = arr[i]; //Select the key i.e. element to compare
            int j = i - 1; //Select the index to begin the comparison at

            while (j >= 0 && arr[j] > key) {//This While Loop compares the key with all elements to its left.
                arr[j + 1] = arr[j];
                /*
                   The key is at index 1. If an element to the left of the key is greater than the
                   key, move it to the right by one position
                */
                j = j - 1; //Move the index to be compared to the left by one position

            }
            arr[j + 1] = key; //Complete the process again, this time one position to the right
        }
        return arr;
    }
}
