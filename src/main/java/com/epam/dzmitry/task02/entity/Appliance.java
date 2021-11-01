package com.epam.dzmitry.task02.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Appliance implements Serializable {

    private double price;

    public Appliance() {
    }

    public Appliance(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appliance)) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice());
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                '}';
    }
}
