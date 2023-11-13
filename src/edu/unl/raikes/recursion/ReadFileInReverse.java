package edu.unl.raikes.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileInReverse {

    public static void main(String[] args) {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("./assets/empty.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("that's an invalid file.");
            System.exit(0);
        }
        
        // call the recursive function
        System.out.println(reverseLines(fileReader));
    }
    
    public static String reverseLines(Scanner scnr) {
        // the file is empty
        if(!scnr.hasNextLine()) {
            return "";
        }
        
        // there's something to read
        String thisLine = scnr.nextLine();
        
        if(!scnr.hasNextLine()) {
            return thisLine;
        }
        else {
            String otherLines = reverseLines(scnr);
            return otherLines + "\n" + thisLine;
        }
    }

}
