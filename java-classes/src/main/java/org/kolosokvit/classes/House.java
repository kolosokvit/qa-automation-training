package org.kolosokvit.classes;

public class House {
    public int id;
    public int flatNumber;
    public double square;
    public int floor;
    public int numberOfRooms;
    public String street;
    public String buildingType;
    public int timeOfUsage;


    public House(int id, int flatNumber, double square, int floor, int numberOfRooms, String street) {
        this.id = id;
        this.flatNumber = flatNumber;
        this.square = square;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }

    public House (int id, int flatNumber, double square, int floor, int numberOfRooms, String street, String buildingType) {
        this.id = id;
        this.flatNumber = flatNumber;
        this.square = square;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
    }

    public House (int id, int flatNumber, double square, int floor, int numberOfRooms, String street, String buildingType, int timeOfUsage) {
        this.id = id;
        this.flatNumber = flatNumber;
        this.square = square;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.timeOfUsage = timeOfUsage;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getId() {
        return id;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public double getSquare() {
        return square;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public int getTimeOfUsage() {
        return timeOfUsage;
    }

    public String toString() {
        return "House id:  " + this.id + " , flat number " + this.flatNumber + " , square " + this.square +
                " sq.m, floor " + this.floor + ", number of rooms: " + this.numberOfRooms + ", "+ this.street + " street.";
    }
}
