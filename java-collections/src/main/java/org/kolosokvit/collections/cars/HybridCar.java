package org.kolosokvit.collections.cars;

import org.kolosokvit.collections.technicalfeatures.BodyType;
import org.kolosokvit.collections.technicalfeatures.EngineType;
import org.kolosokvit.collections.technicalfeatures.FuelType;

public class HybridCar extends Car {
    static final EngineType hybridCarEngineType = EngineType.HYBRID;
    private FuelType fuelType;
    private boolean plugInHybrid;

    public HybridCar(String modelName, int cost, int maxSpeed, BodyType bodyType, FuelType fuelType, double averageFuelConsumption, boolean plugInHybrid) {
        super(modelName, cost, maxSpeed, bodyType, averageFuelConsumption);
        this.fuelType = fuelType;
        this.plugInHybrid = plugInHybrid;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public boolean isPlugInHybrid() {
        return plugInHybrid;
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "modelName='" + getModelName() + '\'' +
                ", cost=" + getCost() + "$" +
                ", maxSpeed=" + getMaxSpeed() + " km/h" +
                ", engineType=" + hybridCarEngineType +
                ", fuelType=" + getFuelType() +
                ", averageFuelConsumption=" + getAverageFuelConsumption() + " l/100km" +
                ", plug-in hybrid=" + (isPlugInHybrid() ? "Yes" : "No") +
                '}';
    }
}
