package models;

public class Location {
	private String name;
    private double xCoordinate;
    private double yCoordinate;
    private boolean hasPackage;

    // Constructor, getters and setters

    public boolean checkPackage() {
        return hasPackage;
    }

    public void placePackage() {
        hasPackage = true;
    }

    public void removePackage() {
        hasPackage = false;
    }
}

