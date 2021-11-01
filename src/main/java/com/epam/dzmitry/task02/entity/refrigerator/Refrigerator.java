package com.epam.dzmitry.task02.entity.refrigerator;

import com.epam.dzmitry.task02.entity.Appliance;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {

    private double powerConsumption;

    private double weight;

    private double freezerCapacity;

    private double overallCapacity;

    private double height;

    private double width;

    public Refrigerator() {
    }

    public Refrigerator(double price, double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
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

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
        if (!(o instanceof Refrigerator)) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.getPowerConsumption(), getPowerConsumption()) == 0 && Double.compare(that.getWeight(), getWeight()) == 0 && Double.compare(that.getFreezerCapacity(), getFreezerCapacity()) == 0 && Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0 && Double.compare(that.getHeight(), getHeight()) == 0 && Double.compare(that.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getWeight(), getFreezerCapacity(), getOverallCapacity(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
