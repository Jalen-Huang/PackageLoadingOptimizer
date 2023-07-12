package model;

import java.util.ArrayList;

public class Bin {
    ArrayList<Package> packages;

    public Bin() {
        packages = new ArrayList<>();
    }

    public int getSize() {
        return packages.size();
    }

    public void addPackage(Package p) {
        packages.add(p);
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Package p: packages) {
            totalWeight += p.getWeight();
        }

        return totalWeight;
    }

    public ArrayList<Package> getPackages() {
        return packages;
    }

    public String toString() {
        String packageListString = "";
        for (Package p: packages) {
            packageListString += p.toString() + "\n";
        }

        return "NEW BIN: \n" + packageListString;
    }
}
