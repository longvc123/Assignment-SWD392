package models;

public class AGV {
    private Path assignedPath;
    private String image;
    private double speed;
    private Location departureLocation;
    private Location currentLocation;
    private int timeToGetPackage;
    private int timeToDeposePackage;

    // Constructor, getters and setters
    public AGV(String image, double speed, Location departureLocation, Location currentLocation, int timeToGetPackage, int timeToDeposePackage) {
        this.image = image;
        this.speed = speed;
        this.departureLocation = departureLocation;
        this.currentLocation = currentLocation;
        this.timeToGetPackage = timeToGetPackage;
        this.timeToDeposePackage = timeToDeposePackage;
    }

    public Path getAssignedPath() {
        return assignedPath;
    }

    public void setAssignedPath(Path assignedPath) {
        this.assignedPath = assignedPath;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }	

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getTimeToGetPackage() {
        return timeToGetPackage;
    }

    public void setTimeToGetPackage(int timeToGetPackage) {
        this.timeToGetPackage = timeToGetPackage;
    }

    public int getTimeToDeposePackage() {
        return timeToDeposePackage;
    }

    public void setTimeToDeposePackage(int timeToDeposePackage) {
        this.timeToDeposePackage = timeToDeposePackage;
    }
}
