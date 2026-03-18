//Base location Class reprsenting a general location with basic details






public class Location {
    private String name; // Name of the location
    private int rating;  // Rating of the location

    // Constructor
    public Location(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Polymorphic method can be overridden in AccessibleLocation
    public String displayDetails() {
        return "Name: " + name + ", Rating: " + rating;
    }
}
