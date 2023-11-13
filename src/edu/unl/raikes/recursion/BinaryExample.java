package edu.unl.raikes.recursion;

public class BinaryExample {

    public static void main(String[] args) {
        System.out.println(makeBinary(19));
    }
    
    public static String makeBinary(int n) {
        System.out.println("i'm in mB where n is "+n );
        
        if(n<2) {
            return "" + n;
        }
        else {
            String ret = makeBinary(n / 2) + n % 2;
            System.out.println("im in mB where n is " + n+
                    " and the return value is " + ret);
            return ret;
        }
    }

}
