package edu.unl.raikes.recursion;

public class MultExample {

    public static void main(String[] args) {
        System.out.println(mult(-3,-4));
    }
    
    public static int mult(int numberOfTimes, int valueToAdd) {
        // base case, don't add anything any times
        if (numberOfTimes == 0) {
            return 0;
        }
        // if negative
        else if (numberOfTimes < 0) {
            return -1 * mult(Math.abs(numberOfTimes), valueToAdd);
        }
        // recursive case
        else {
            return valueToAdd + mult(numberOfTimes - 1, valueToAdd);
        }
    }

}
