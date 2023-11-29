package edu.unl.raikes.sorting;

import java.util.Arrays;

public class Sorting {
    public static int countSwaps = 0;
    public static int countComparisons = 0;
    
public static void main(String[] args) {
    System.out.println("Insertion sort:");
    int[] arr = {1444, 29, 14, 3, 1, -3};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("swap count: "+ countSwaps);
    System.out.println("comparison count: "+ countComparisons);
    

    System.out.println("\nSelection sort:");
    countSwaps = 0;
    countComparisons = 0;
    int[] arr2 = {1444, 29, 14, 3, 1, -3};
    selectionSort(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println("swap count: "+ countSwaps);
    System.out.println("comparison count: "+ countComparisons);
    
    System.out.println("\nBubble sort:");
    countSwaps = 0;
    countComparisons = 0;
    int[] arr3 = {1444, 29, 14, 3, 1, -3};
    bubbleSort(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println("swap count: "+ countSwaps);
    System.out.println("comparison count: "+ countComparisons);
}

public static void selectionSort(int[] arr){
    for(int i = 0; i<arr.length;i++){
        int currentMinIndex = i;
        for(int j = i + 1; j < arr.length; j++){
            countComparisons++;
            if(arr[j]< arr[currentMinIndex]){
                currentMinIndex = j;
            }
        }
        swap(arr, currentMinIndex, i);
    }
}

public static void insertionSort(int[] arr){
for(int i = 1; i<arr.length;i++){
    int j = i;
    while ( j > 0 && arr[j] < arr[j-1]){
        countComparisons++;
        swap(arr, j, j-1);
        j--;
    }
    countComparisons++;
}
}

static void bubbleSort(int[] ar) { 
    for (int i = 0; i< ar.length - 1; i++) {
        for (int j = 1; j< ar.length; j++){
            countComparisons++;
            if ( ar[j-1] > ar[j] ) { 
                swap(ar, j-1, j); 
            }
         } 
    } 
}

public static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    countSwaps++;
}
}
