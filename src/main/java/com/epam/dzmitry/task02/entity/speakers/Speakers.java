package com.epam.dzmitry.task02.entity.speakers;

import com.epam.dzmitry.task02.entity.Appliance;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {

    private double powerConsumption;

    private double numberOfSpeakers;

    private double cordLength;

    public Speakers() {
    }

    public Speakers(double price, double powerConsumption, double numberOfSpeakers, double cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.getPowerConsumption(), getPowerConsumption()) == 0 && Double.compare(speakers.getNumberOfSpeakers(), getNumberOfSpeakers()) == 0 && Double.compare(speakers.getCordLength(), getCordLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getNumberOfSpeakers(), getCordLength());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", cordLength=" + cordLength +
                '}';
    }
}
