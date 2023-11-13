package edu.unl.raikes.recursion;

public class SumElementsInArray {

    public static void main(String[] args) {
        int[] array = {2,-3,7,8};
        
        System.out.print("The sum of elements is: " + sumElements(array));
    }

    public static int sumElements(int[] a) {
        return sumElements(a, a.length);
    }
    
    private static int sumElements(int[] a, int lengthToConsider) {
        // base case: length to consider is 1
        if(lengthToConsider == 1) {
            return a[0];
        }
        
        // recurse
        int elementToAdd = a[lengthToConsider-1];
        int sumOfThoseBeforeMe = sumElements(a, lengthToConsider - 1);
        
        // calculate the sum
        return sumOfThoseBeforeMe + elementToAdd;
    }
}
