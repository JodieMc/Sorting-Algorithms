package ie.gmit.dip.algorithms;

public class QuickSort extends Algorithm {
    public QuickSort() {
        algorithmName = "QuickSort";
    }

    /*
       Quicksort. Code source: https://github.com/MIBMS/Quicksort/blob/master/src/Quicksort.java
       Quicksort is an in-place, comparison based, unstable sorting algorithm with n log n in the
       best case, 𝑛^2 in the worst case and n log n in the average case of time complexity
    */

    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int p, int r) {
        /*
           p here is the starting index and
           r is the ending index
         */
        if (p < r) {
            int q = partition(arr, p, r); //Partition the elements around the pivot
            quickSort(arr, p, q - 1); //Before the partition index
            quickSort(arr, q + 1, r); //After the partition index
        }
    }

    private int partition(int[] a, int p, int r) {
        int temp;
        int pivot = a[r]; //Pivot
        int i = p - 1; //Index of smaller element
        for (int j = p; j < r; j++) {
            if (a[j] <= pivot) { //If the current element is smaller than the pivot
                i++; //Increment the index of the smaller element
                // swap a[i] and a[j]
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        // swap a[i] and a[r]
        temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        return i; //Smaller element
    }
}
