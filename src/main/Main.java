package main;


import model.BinPacker;
import model.Package;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinPacker binPacker = new BinPacker();
        ArrayList<Package> packageList1 = new ArrayList<>();
        packageList1.add(new Package(1, "1"));
        packageList1.add(new Package(2, "2"));
        packageList1.add(new Package(3, "3"));

        ArrayList<Package> packageList2 = new ArrayList<>();
        packageList2.add(new Package(6, "4"));
        packageList2.add(new Package(9, "5"));
        packageList2.add(new Package(8, "6"));
        packageList2.add(new Package(8, "7"));
        packageList2.add(new Package(7, "8"));
        packageList2.add(new Package(7, "9"));


        System.out.println(BinPacker.solveBinPacking(packageList1, 3));
        System.out.println(BinPacker.solveBinPacking(packageList2, 15));
    }
}