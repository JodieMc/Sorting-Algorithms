package ie.gmit.dip;

/*
   The Runner class contains the main method which is the entry point of any Java program.
   The main method then calls all the other methods for the program to run
 */

public class Runner {

    public static void main(String[] args) throws Exception {
        TestHarness th = new TestHarness();
        th.runTests();
    }
}
