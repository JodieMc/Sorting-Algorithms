package ie.gmit.dip;

public class Timer { //Class to record running times for each algorithm
    private long startTime;
    private long endTime;

    public void startTimer() {
        startTime = System.nanoTime();
    } //Record the start time/current time

    public void endTimer() {
        endTime = System.nanoTime();
    } //Record the end time

    public long elapsedTime() {
        return (endTime - startTime) / 100000;
    }
    /*
       Subtract startTime from endTime to calculate the time elapsed and divide
       by 100,000 to convert from nanoseconds to milliseconds
     */
}

