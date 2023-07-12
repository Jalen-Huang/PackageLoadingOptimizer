package model;

public class Package {

    int weight;
    int route;
    String id;

    public Package(int weight, int route, String id) {
        this.weight = weight;
        this.route = route;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public int getRoute() {return route;}

    public String getId() {
        return id;
    }

    public String toString() {
        return "Weight: " + weight + " | ID: " + id;
    }
}
