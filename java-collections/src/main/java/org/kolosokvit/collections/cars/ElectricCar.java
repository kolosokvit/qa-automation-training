package org.kolosokvit.collections.cars;

import org.kolosokvit.collections.technicalfeatures.BodyType;
import org.kolosokvit.collections.technicalfeatures.EngineType;

public class ElectricCar extends Car {
    static final EngineType electricCarEngineType = EngineType.ELECTRIC;
    static double averageFuelConsumption = 0.0;
    private int distanceRangePerCharge;

    public ElectricCar(String modelName, int cost, int maxSpeed, BodyType bodyType, int distanceRangePerCharge) {
        super(modelName, cost, maxSpeed, bodyType, averageFuelConsumption);
        this.distanceRangePerCharge = distanceRangePerCharge;
    }

    public int getDistanceRangePerCharge() {
        return distanceRangePerCharge;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "modelName='" + getModelName() + '\'' +
                ", cost=" + getCost() + "$" +
                ", maxSpeed=" + getMaxSpeed() + " km/h" +
                ", engineType=" + electricCarEngineType +
                ", distanceRangePerCharge=" + getDistanceRangePerCharge() +
                ", averageFuelConsumption=" + averageFuelConsumption + " l/100km" +
                '}';
    }
}
