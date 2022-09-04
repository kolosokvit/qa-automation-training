package org.kolosokvit.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kolosokvit.collections.cars.Car;
import org.kolosokvit.collections.cars.ElectricCar;
import org.kolosokvit.collections.cars.HybridCar;
import org.kolosokvit.collections.cars.PetrolCar;
import org.kolosokvit.collections.technicalfeatures.BodyType;
import org.kolosokvit.collections.technicalfeatures.FuelType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class TaxiCompanyTest {
    static final List<Car> cars = Arrays.asList(
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

    @Test
    void testGetTaxiCompanyCost() {
        TaxiCompany testTaxiCompany = new TaxiCompany("testTaxiCompany", cars);
        Assertions.assertEquals(272000, testTaxiCompany.getTaxiCompanyCost());
    }

    @Test
    void testSortCarsByAverageFuelConsumption() {
        TaxiCompany testTaxiCompany = new TaxiCompany("testTaxiCompany", cars);
        testTaxiCompany.sortCarsByAverageFuelConsumption();
        for (int i = 0; i < testTaxiCompany.getCars().size() - 1; i++) {
            Car currentCar = testTaxiCompany.getCars().get(i);
            Car nextCar = testTaxiCompany.getCars().get(i + 1);
            Assertions.assertTrue(currentCar.getAverageFuelConsumption() <= nextCar.getAverageFuelConsumption());
        }
    }


    @Test
    void testGetCarsByMaxSpeed() {
        TaxiCompany testTaxiCompany = new TaxiCompany("testTaxiCompany", cars);
        int maxSpeed = 190;
        ArrayList<Car> selectedByMaxSpeedCars = testTaxiCompany.getCarsByMaxSpeed(maxSpeed);
        for (Car car : selectedByMaxSpeedCars) {
            Assertions.assertTrue(car.getMaxSpeed() >= maxSpeed);
        }
    }
}