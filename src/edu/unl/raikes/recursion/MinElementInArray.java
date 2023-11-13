package edu.unl.raikes.recursion;

import java.util.Arrays;

public class MinElementInArray {

    public static void main(String[] args) {
        int[] array = {2,6,4,6,8,5,3,7,2,-3,7,8};
        System.out.print("The min element is: " + findMin(array));
    }
    
    public static int findMin(int[] a) {
        return findMin(a, a.length);
    }

    private static int findMin(int[] a, int lengthToConsider) {
        // base case is when there is only one element
        if(lengthToConsider == 1) {
            return a[0];
        }
        
        // recursive case - make the array smaller
        int elementCutOffFromA = a[lengthToConsider - 1];
        int minInNewA = findMin(a, lengthToConsider - 1);
        
        // find min of two elements
        if (minInNewA < elementCutOffFromA) {
            return minInNewA;
        } else {
            return elementCutOffFromA;
        }
    }
}
