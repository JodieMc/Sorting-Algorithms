package ie.gmit.dip.algorithms;

/*
   The abstract class 'Algorithms' is used as a generic
   interface for TestHarness to use the code
 */

public abstract class Algorithm {
    public String algorithmName = null;

    public abstract int[] sort(int[] arr);
}

