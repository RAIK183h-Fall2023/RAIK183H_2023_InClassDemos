package edu.unl.raikes.recursion;

public class BinaryExampleReturnString {

    public static void main(String[] args) {
        printBinary(19);
    }
    
    public static void printBinary(int n) {
        if(n<2) {
            System.out.print(n);
        }
        else {
            printBinary(n / 2);
            System.out.print(n % 2);
        }
    }

}
