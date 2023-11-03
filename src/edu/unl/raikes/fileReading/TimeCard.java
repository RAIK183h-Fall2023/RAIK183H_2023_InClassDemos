/**
 * 
 */
package edu.unl.raikes.fileReading;

import java.util.ArrayList;

/**
 * The  type is used for recording timecard information
 *
 * @author svalentine5
 *
 */
public class TimeCard {
    private int id;
    private String name;
    private ArrayList<Double> hours;
    
    /**
     * Constructs an object of the TimeCard class. 
     *
     * @param id
     * @param name
     * @param hours
     */
    public TimeCard(int id, String name, ArrayList<Double> hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }
    
    /**
     * Returns the id that belongs to the TimeCard class.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * Allows a user of this class to set a TimeCard object's id.
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Returns the name that belongs to the TimeCard class.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Allows a user of this class to set a TimeCard object's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the hours that belongs to the TimeCard class.
     *
     * @return the hours
     */
    public ArrayList<Double> getHours() {
        return hours;
    }
    /**
     * Allows a user of this class to set a TimeCard object's hours.
     *
     * @param hours the hours to set
     */
    public void setHours(ArrayList<Double> hours) {
        this.hours = hours;
    }
    
    private double totalHoursWorked(){
        double sum = 0;
        for(int i = 0; i< hours.size(); i++) {
            sum += hours.get(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        double totalHours = totalHoursWorked();
        double avgHours = totalHours/hours.size();
        return String.format("%s (ID#%d) worked %.1f hours (%.2f hours/day)", name, id, totalHours, avgHours); 
    }
    
    
}
