package models;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Location> locations;

    // Constructor
    public Path() {
        locations = new ArrayList<Location>();
    }

    // Method to move along the path
    public void move() {
        // Logic for moving along the path
    }

    public void zoom(double factor) {
        // Logic for zooming the path
    }

    public void rotate(double angle) {
        // Logic for rotating the path
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}

