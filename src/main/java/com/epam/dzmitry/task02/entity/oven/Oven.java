package com.epam.dzmitry.task02.entity.oven;

import com.epam.dzmitry.task02.entity.Appliance;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {

    private double powerConsumption;

    private double weight;

    private double capacity;

    private double depth;

    private double height;

    private double width;

    public Oven() {
    }

    public Oven(double price, double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.getPowerConsumption(), getPowerConsumption()) == 0 && Double.compare(oven.getWeight(), getWeight()) == 0 && Double.compare(oven.getCapacity(), getCapacity()) == 0 && Double.compare(oven.getDepth(), getDepth()) == 0 && Double.compare(oven.getHeight(), getHeight()) == 0 && Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getWeight(), getCapacity(), getDepth(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
