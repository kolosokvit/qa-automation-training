package org.kolosokvit.collections.cars;

import org.kolosokvit.collections.technicalfeatures.BodyType;

public abstract class Car {
    private String modelName;
    private int cost;
    private int maxSpeed;
    private BodyType bodyType;
    private double averageFuelConsumption;

    protected Car(String modelName, int cost, int maxSpeed, BodyType bodyType, double averageFuelConsumption) {
        this.modelName = modelName;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
        this.bodyType = bodyType;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getModelName() {
        return modelName;
    }

    public int getCost() {
        return cost;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", cost=" + cost  + "$" +
                ", maxSpeed=" + maxSpeed + " km/h" +
                ", averageFuelConsumption=" + averageFuelConsumption + " l/100km" +
                '}';
    }
}
