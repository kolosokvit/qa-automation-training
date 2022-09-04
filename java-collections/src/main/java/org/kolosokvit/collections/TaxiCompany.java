package org.kolosokvit.collections;

import org.kolosokvit.collections.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class TaxiCompany {
    private String companyName;
    private List<Car> cars;

    public TaxiCompany(String companyName, List<Car> cars) {
        this.companyName = companyName;
        this.cars = cars;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public ArrayList<Car> getCarsByMaxSpeed(int maxSpeed) {
        ArrayList<Car> selectedByMaxSpeedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= maxSpeed) {
                selectedByMaxSpeedCars.add(car);
            }
        }
        if (selectedByMaxSpeedCars.isEmpty()) {
            System.out.println("There are no cars with maximum speed greater than " + maxSpeed + " km/h in your taxi company.");
        } else {
            System.out.println("Cars with maximum speed greater than " + maxSpeed + " km/h in your taxi company:");
            for (Car car : selectedByMaxSpeedCars) {
                System.out.println(car.toString());
            }
        }
        System.out.println();
        return selectedByMaxSpeedCars;
    }

    public int getTaxiCompanyCost() {
        int taxiCompanyCost = 0;
        for (Car car : cars) {
            taxiCompanyCost += car.getCost();
        }
        System.out.println("Total cost of your taxi company: " + taxiCompanyCost + "$");
        System.out.println();
        return taxiCompanyCost;
    }

    public void sortCarsByAverageFuelConsumption() {
        for (int i = 0; i < cars.size(); i ++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getAverageFuelConsumption() > cars.get(j).getAverageFuelConsumption()) {
                    Car swap = cars.get(j);
                    cars.set(j, cars.get(i));
                    cars.set(i, swap);
                }
            }
        }
        System.out.println("Your cars sorted by averageFuelConsumption:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();
    }
}
