package model;

public class Package {

    int weight;

    String id;

    public Package(int weight, String id) {
        this.weight = weight;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Weight: " + weight + " | ID: " + id;
    }
}
