package ie.gmit.dip;

import ie.gmit.dip.algorithms.*;
import java.util.Arrays;
import java.util.List;

//A class to manage the gathering of the data and its output to the console
public class TestHarness {
    final int TEST_CYCLES = 10;
    //The input sizes to be tested are specified in the list below
    private List<Integer> inputSizes = Arrays.asList(100, 1000, 2500, 5000, 10000, 20000, 50000, 100000);

    private List<Algorithm> algorithms =
            Arrays.asList(
                    new BubbleSort(), //Call each of the Sorting Algorithm classes
                    new CountingSort(),
                    new InsertionSort(),
                    new QuickSort(),
                    new SelectionSort()
            );

    public void runTests() throws Exception {
        System.out.println("Algorithm, Array size, Average time"); //Output to console and csv

        for (int i = 0; i < inputSizes.size(); i++) {
            int inputSize = inputSizes.get(i);
            int[] array = randomArray(inputSize); //Put the input size into the random array

            for (int j = 0; j < algorithms.size(); j++) {
                Algorithm algo = algorithms.get(j); //Apply the algorithm

                long totalExecutionTime = 0L;
                for (int k = 0; k < TEST_CYCLES; k++) {
                    int[] testArray = array.clone(); //Clone ensures an exact copy of input array for each algorithm
                    Timer timer = new Timer();

                    timer.startTimer(); //Start the timer
                    int[] sortedArray = algo.sort(testArray); //Sort the array
                    timer.endTimer(); //End the timer

                    long elapsedTime = timer.elapsedTime(); //Calculate the elapsed time
                    totalExecutionTime += elapsedTime;
                    verifySorted(sortedArray);

                }

                String result = algo.algorithmName + ", " +
                        inputSize + ", " +
                        totalExecutionTime / TEST_CYCLES;
                System.out.println(result); //Output the average result
            }
        }
    }
    /*
      If an error occurs and the array is not sorted an exception will
      be thrown and "Array not sorted" sent to the console so the user
      is aware of the problem
     */
    private void verifySorted(int[] sortedArray) throws Exception {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] > sortedArray[i + 1]) {
                throw new Exception("Array not sorted");
            }
        }
    }
    //Code below returns an array of randomly generated numbers
    private int[] randomArray(int n) {
        int[] array = new int[n]; //Create an array of size n
        for (int i = 0; i < n; i++) { //Loop over the above array
            array[i] = (int) (Math.random() * 100); //Math.random returns a random number
        }
        return array;
    }


}


