package org.kolosokvit.collections.cars;

import org.kolosokvit.collections.technicalfeatures.BodyType;
import org.kolosokvit.collections.technicalfeatures.EngineType;
import org.kolosokvit.collections.technicalfeatures.FuelType;

public class PetrolCar extends Car {
    static final EngineType petrolCarEngineType = EngineType.INTERNAL_COMBUSTION;
    private FuelType fuelType;

    public PetrolCar(String modelName, int cost, int maxSpeed, BodyType bodyType, FuelType fuelType, double averageFuelConsumption) {
        super(modelName, cost, maxSpeed, bodyType, averageFuelConsumption);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }


    @Override
    public String toString() {
        return "PetrolCar{" +
                "modelName='" + getModelName() + '\'' +
                ", cost=" + getCost() + "$" +
                ", maxSpeed=" + getMaxSpeed() + " km/h" +
                ", engineType=" + petrolCarEngineType +
                ", fuelType=" + getFuelType() +
                ", averageFuelConsumption=" + getAverageFuelConsumption() + " l/100km" +
                '}';
    }
}
