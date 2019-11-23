package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

//        BONUS
        CompoundComparator compoundComparator = new CompoundComparator();
        compoundComparator.add(new StateComparator());
        compoundComparator.add(new PopulationComparator());

        // TODO - Use different comparators here
//        Comparators to Use: NameComparator, PopulationComparator, Area Comparator
        AreaComparator comparator = new AreaComparator();

        cities.sort(compoundComparator);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
