package org.kolosokvit.classes;

import java.util.ArrayList;
import java.util.List;

public class MainTask {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();
        House house1 = new House(1, 1, 80.0, 5, 3, "Maple");
        houses.add(house1);
        House house2 = new House(2, 10, 65.5, 10, 2, "Maple");
        houses.add(house2);
        House house3 = new House(3, 34, 73.2, 3, 3, "Lakeside");
        houses.add(house3);
        House house4 = new House(4, 21, 54.7, 2, 1, "Lakeside");
        houses.add(house4);
        House house5 = new House(5, 31, 110.3, 1, 4, "Mountain");
        houses.add(house5);
        House house6 = new House(6, 5, 69.3, 3, 3, "Mountain");
        houses.add(house6);

        getFlatsWithNumberOfRooms(3, houses);
        getFlatsByNumberOfRoomsAndFlour(3, 10, 11, houses);
        getFlatsBySquare(70.0, houses);
    }

    public static void getFlatsWithNumberOfRooms(int numberOfRooms, List<House> houses) {
        ArrayList<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getNumberOfRooms() == numberOfRooms) {
                result.add(house);
            }
        }
        if (!result.isEmpty()) {
            System.out.println("Flats with " + numberOfRooms + " rooms:");
            for (House house : result) {
                System.out.println(house);
            }
        } else {
            System.out.println("There are no " + numberOfRooms + "-room flats.");
        }
    }

    public static void getFlatsByNumberOfRoomsAndFlour(int numberOfRooms, int minFloor, int maxFloor, List<House> houses) {
        ArrayList<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getNumberOfRooms() == numberOfRooms && house.getFloor() >= minFloor && house.getFloor() <= maxFloor) {
                result.add(house);
            }
        }
        if (!result.isEmpty()) {
            System.out.println("Flats with " + numberOfRooms + " rooms between " + minFloor + " and " + maxFloor + " floors:");
            for (House house : result) {
                System.out.println(house);
            }
        } else {
            System.out.println("There are no " + numberOfRooms + "-room flats on floors from " + minFloor + " to " + maxFloor + ".");
        }
    }

    public static void getFlatsBySquare(double minSquare, List<House> houses) {
        ArrayList<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getSquare() > minSquare) {
                result.add(house);
            }
        }
        if (!result.isEmpty()) {
            System.out.println("Flats with square greater than " + minSquare + " sq.m :");
            for (House house : result) {
                System.out.println(house);
            }
        } else {
            System.out.println("There are no flats with square greater than " + minSquare + " sq.m.");
        }
    }
}
