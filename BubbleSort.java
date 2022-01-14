package ie.gmit.dip.algorithms;

public class BubbleSort extends Algorithm { //Extends keyword used to inherit from Algorithm class
    public BubbleSort() {
        algorithmName = "BubbleSort";
    }

      /*
         Bubble Sort. Code source: https://www.javatpoint.com/bubble-sort-in-java
         Bubble Sort is an in-place, comparison based, stable sorting algorithm with n in the
         best, and 𝑛^2 in the worst and average cases of time complexity
       */

    public int[] sort(int[] arr) {
        int n = arr.length; // Declare variable n (used to obtain the size of the array)
        int temp = 0; // Declare variable temp (used to swap the elements)

        for (int i = 0; i < n; i++) {//For loop to loop through the array and access the array elements
            for (int j = 1; j < (n - i); j++) {//For loop to compare the array elements
                if (arr[j - 1] > arr[j]) {//If element on left is larger than element on right:
                    //the code below swaps the elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
