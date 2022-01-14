package ie.gmit.dip.algorithms;

public class CountingSort extends Algorithm {
    public CountingSort() {
        algorithmName = "CountingSort";
    }

    /*
       Counting Sort. Code source: https://github.com/AmanChand/CountingSort.Java/blob/master/CountingSort.java
       Counting Sort is a not-in-place, non-comparison, stable sorting algorithm with n + k time complexity in the
       best, worst and average cases
     */

    public int[] sort(int[] arr) {

        int maxValue = getMaxValue(arr); //Find the largest element in the array
        int[] finalSortedArray = new int[arr.length]; //Array to store the result
        int[] tempArray = new int[maxValue + 1]; //Array to store the count of each unique object

        //Loop to iterate and determine the count of individual elements
        for (int i = 0; i < arr.length; i++) {
            tempArray[arr[i]] = tempArray[arr[i]] + 1;
        }
        //Loop to store the count of each element
        for (int i = 1; i < maxValue + 1; i++) {
            tempArray[i] = tempArray[i] + tempArray[i - 1];
        }
        //Loop to change the actual position of the element in the output array and copy so it contains sorted elements
        for (int i = (arr.length - 1); i >= 0; i--) {
            finalSortedArray[tempArray[arr[i]] - 1] = arr[i];
            tempArray[arr[i]] = tempArray[arr[i]] - 1;
        }
        return finalSortedArray;
    }

    private int getMaxValue(int[] arrayToSort) {
        int maxVal = Integer.MIN_VALUE;
        for (int i : arrayToSort) { //Loop through the input array to find the max value initially
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }
}
