package edu.unl.raikes.recursion;

public class ReverseString {

    public static void main(String[] args) {
        String string = "Tacos";
        
        System.out.print("The reversed string is: " + reverse(string));
    }

    public static String reverse(String s) {
        return reverse(s, s.length());
    }

    private static String reverse(String s, int lengthToConsider){
        if(lengthToConsider == 1){
            return s.charAt(0)+"";
        }

        // when I make the problem smaller, what data is ignored?
        char myDataToContribute = s.charAt(lengthToConsider - 1);

        // solve the smaller problem
        String everythingBeforeMe = reverse(s, lengthToConsider - 1);

        // combine (concatenate)
        return myDataToContribute + everythingBeforeMe;
    }
}