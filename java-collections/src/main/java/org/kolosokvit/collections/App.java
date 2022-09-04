package org.kolosokvit.collections;

import org.kolosokvit.collections.cars.Car;
import org.kolosokvit.collections.cars.ElectricCar;
import org.kolosokvit.collections.cars.HybridCar;
import org.kolosokvit.collections.cars.PetrolCar;
import org.kolosokvit.collections.technicalfeatures.BodyType;
import org.kolosokvit.collections.technicalfeatures.FuelType;

import java.util.*;

public class App {
    static List<Car> availableCars = Arrays.asList(
            new PetrolCar("Kia Rio", 19000, 193, BodyType.SEDAN, FuelType.PETROL, 6.0),
            new PetrolCar("Renault Captur", 35000, 187, BodyType.SUV, FuelType.DIESEL, 7.1),
            new PetrolCar("Hyundai Accent", 25000, 193, BodyType.SEDAN, FuelType.PETROL, 6.3),
            new ElectricCar("Chevrolet Bolt", 27000, 145, BodyType.HATCHBACK, 383),
            new ElectricCar("BMW i3", 36000, 150, BodyType.HATCHBACK, 300),
            new ElectricCar("Nissan Leaf", 32000, 157, BodyType.HATCHBACK, 385),
            new HybridCar("Toyota Prius", 38000, 180, BodyType.HATCHBACK, FuelType.PETROL, 3.0, true),
            new HybridCar("Honda Insight", 29000, 182, BodyType.LIFTBACK, FuelType.PETROL, 3.7, false),
            new HybridCar("Toyota Corolla", 31000, 183, BodyType.HATCHBACK, FuelType.PETROL, 4.5, false)
    );

    public static List<Car> addCars(int n) {
        ArrayList<Car> addedCars = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            addedCars.add(availableCars.get(random.nextInt(availableCars.size() - 1)));
        }
        return addedCars;
    }

    public static void main(String[] args) {
        System.out.println("Please, enter your taxi company name:");
        Scanner scanner = new Scanner(System.in);
        String taxiCompanyName = scanner.nextLine();
        System.out.println("Please, enter number of cars in your taxi company:");
        int numberOfCarsInTaxiCompany = scanner.nextInt();
        TaxiCompany taxiCompany = new TaxiCompany(taxiCompanyName, addCars(numberOfCarsInTaxiCompany));
        System.out.println("Taxi company \"" + taxiCompany.getCompanyName() + "\" was created.");
        System.out.println("You have " + taxiCompany.getCars().size() + " cars.");
        taxiCompany.getTaxiCompanyCost();
        taxiCompany.sortCarsByAverageFuelConsumption();
        System.out.println("Let's pick up cars with maximum speed higher than specified speed limit. Please, enter speed limit:");
        int speedLimit = scanner.nextInt();
        taxiCompany.getCarsByMaxSpeed(speedLimit);
        scanner.close();
    }
}