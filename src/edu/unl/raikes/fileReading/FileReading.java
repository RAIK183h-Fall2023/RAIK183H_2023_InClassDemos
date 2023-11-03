package edu.unl.raikes.fileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(new File("out2.txt"));
        output.println("Hello, file!");
        output.println("This is a second line of output.");

        
        // declare file we'll read
        File file = new File("./assets/hours.txt");
                
        // read each line of the file
        Scanner fileReader = new Scanner(file);
        
        while(fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            
            // make a new scanner for the line
            Scanner lineReader = new Scanner(line);
            
            int id = lineReader.nextInt();
            String name = lineReader.next();
            ArrayList<Double> hours = new ArrayList<Double>();
                    
            while (lineReader.hasNextDouble()) {
                double hoursThatDay = lineReader.nextDouble();
                hours.add(hoursThatDay);
            }
            
            // create the timecard
            TimeCard timeCard = new TimeCard(id,name,hours);
            output.println(timeCard);
        }
        
        // calculate stuff
        // output appropriately
        
        
        

        
        // desired output:
        // Sabi (ID#123) worked 31.4 hours (7.85 hours/day)
        // Eric (ID#456) worked 36.8 hours (7.36 hours/day)
        // Juan (ID#789) worked 39.5 hours (7.9 hours/day)

        output.close();
        fileReader.close();
    }

}
