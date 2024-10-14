package models;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<Location> locations;
    private List<Path> paths;

    // Constructor
    public Map() {
        locations = new ArrayList<Location>();
        paths = new ArrayList<Path>();
    }

    // Getters and setters
    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void addPath(Path path) {
        paths.add(path);
    }

    public void assignPathToAGV(AGV agv, Path path) {
        agv.setAssignedPath(path);
    }
}

