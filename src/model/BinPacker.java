package model;

import java.util.*;

public class BinPacker {


    public static ArrayList<Bin> FirstFitDecreasing(ArrayList<Package> packages, int binCapacity) {
        Collections.sort(packages, new Comparator<Package>() {
            @Override
            public int compare(Package p1, Package p2) {
                if (p1.weight > p2.weight) return -1;
                if (p1.weight < p2.weight) return 1;
                return 0;
            }});
        ArrayList<Bin> solution = new ArrayList<>();
        solution.add(new Bin());
        for (Package p: packages) {
            Bin currentBin = solution.get(solution.size() - 1);
            if (currentBin.getTotalWeight() + p.getWeight() <= binCapacity) {
                currentBin.addPackage(p);
            } else {
                Bin newBin = new Bin();
                newBin.addPackage(p);
                solution.add(newBin);
            }
        }
        return solution;
    }



    public static ArrayList<Bin> solveBinPacking(ArrayList<Package> packages, int binCapacity) {
        ArrayList<ArrayList<Bin>> solutions = new ArrayList<>();
        while (packages.size() > 0) {
            for (ArrayList<Bin> solution: solutions) {

            }
        }
        return new ArrayList<>();
    }


}
