package ie.gmit.dip.algorithms;

public class SelectionSort extends Algorithm {
    public SelectionSort() {
        algorithmName = "SelectionSort";
    }

    /*
       Selection Sort. Code source: Lecture notes(Sorting Algorithms 2, Mannion, P.(2021))
       Selection Sort is an in-place, comparison based, unstable sorting algorithm with 𝑛^2 time
       complexity in the best, worst and average cases.
    */


    public int[] sort(int[] arr) {
        //This algorithm uses two subarrays to sort an array

        int outer = 0, inner = 0, min = 0; //Declare variables and initialise to zero

        /*
           Using ascending order here, therefore use a for loop to iterate through the array and allow
           'outer' to count up. The algorithm will find the min element from the unsorted subarray and
           move it into the sorted subarray
         */

        //For each iteration expand the margins of the unsorted subarray
        for (outer = 0; outer < arr.length - 1; outer++) {
            min = outer;
            for (inner = outer + 1; inner < arr.length; inner++) {
                if (arr[inner] < arr[min]) {//Locate the index of the min element in the unsorted subarray
                    min = inner;
                }
            }
            //Swap the min element with [outer] in the sorted subarray
            int temp = arr[outer];
            arr[outer] = arr[min];
            arr[min] = temp;
            //Continue with this process until there are no elements left to search
        }
        return arr;
    }
}
