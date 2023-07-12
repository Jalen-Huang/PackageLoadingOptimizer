package model;

import java.util.ArrayList;
import java.util.Collections;

public class BinPacker {


    public static ArrayList<Bin> FirstFitDecreasing(ArrayList<Package> packages, int binCapacity) {
        Collections.sort(packages, (p1, p2) -> {
            if (p1.weight > p2.weight) return -1;
            if (p1.weight < p2.weight) return 1;
            return 0;
        });
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
                Boolean valid = isValidPackageCombination(new ArrayList<>(), binCapacity, new ArrayList<>());
            }
        }
        return new ArrayList<>();
    }

    private static Boolean isValidPackageCombination(ArrayList<Bin> bins,
                                                     int binCapacity,
                                                     ArrayList<ArrayList<Integer>> impossibleRoutes) {
        if (isBinCapacityExceeded(bins, binCapacity)) {
            return false;
        }
        ArrayList<Integer> routes = new ArrayList<>();
        for (Bin bin: bins) {
            for (Package packet: bin.getPackages()) {
                routes.add(packet.getRoute());
            }
        }
        if (isRouteCombinationViolated(routes, impossibleRoutes)) {
            return false;
        }

        return true;
    }

    private static Boolean isBinCapacityExceeded(ArrayList<Bin> bins,
                                                 int binCapacity) {
        for (Bin bin: bins) {
            if (bin.getTotalWeight() > binCapacity) {
                return true;
            }
        }
        return false;
    }

    private static Boolean isRouteCombinationViolated(ArrayList<Integer> routes,
                                                      ArrayList<ArrayList<Integer>> impossibleRoutes) {
        for (ArrayList<Integer> impossibleRoute: impossibleRoutes) {
            if (routes.contains(impossibleRoute.get(0)) && routes.contains(impossibleRoute.get(1))) {
                return true;
            }
        }
        return false;
    }


}
