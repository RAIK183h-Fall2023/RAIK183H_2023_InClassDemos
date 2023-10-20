package edu.unl.raikes.day05;

public class Town implements Comparable<Town>{
    // name
    private String name;
    
    // mayor
    private String mayor;
    
    // x coord
    private double xCoord;
    
    // y coord
    private double yCoord;
    
    // constructor
    public Town(String name, String mayor, double xCoord, double yCoord) {
        this.name = name;
        this.mayor = mayor;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    
    /**
     * Returns the name that belongs to the Town class.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Allows a user of this class to set a Town object's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the xCoord that belongs to the Town class.
     *
     * @return the xCoord
     */
    public double getxCoord() {
        return xCoord;
    }

    /**
     * Allows a user of this class to set a Town object's xCoord.
     *
     * @param xCoord the xCoord to set
     */
    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    /**
     * Returns the yCoord that belongs to the Town class.
     *
     * @return the yCoord
     */
    public double getyCoord() {
        return yCoord;
    }

    /**
     * Allows a user of this class to set a Town object's yCoord.
     *
     * @param yCoord the yCoord to set
     */
    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    // getter function - allows people to get the information about
    // this object, when they have a variable pointing to this object
    public String getMayor() {
        return this.mayor;
    }
    
    // setter function - allows people to SET the state of an object,
    // when they have a variable pointing to this object
    public void setMayor(String mayor) {
        if(mayor.length() > 15) {
            this.mayor = mayor;
        }
    }
    
    public int compareTo(Town otherTown) {
        // returns positive number when this object is greater than the other object
        if(this.mayor.length() > otherTown.getMayor().length()) {
            return 1;
        }
        // returns zero when equal
        else if (this.mayor.length() == otherTown.getMayor().length()) {
            return this.mayor.compareTo(otherTown.getMayor());
        }
        // returns negative when this object is less than other
        else {
            return -1;
        }
    }
    
    @Override
    public String toString() {
        return "Welcome to "+name+"! Our mayor is "+mayor+
                " and we are at point ("+xCoord+","+yCoord+").";
    }
}
