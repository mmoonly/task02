package com.epam.dzmitry.task02.entity.vacuumcleaner;

import com.epam.dzmitry.task02.entity.Appliance;

import java.io.Serializable;
import java.util.Objects;

public class VacuumCleaner extends Appliance implements Serializable {

    private double powerConsumption;

    private FilterType filterType;

    private BagType bagType;

    private WandType wandType;

    private double motorSpeedRegulation;

    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double price, double powerConsumption, FilterType filterType, BagType bagType, WandType wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public BagType getBagType() {
        return bagType;
    }

    public WandType getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public void setBagType(BagType bagType) {
        this.bagType = bagType;
    }

    public void setWandType(WandType wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.getPowerConsumption(), getPowerConsumption()) == 0 && Double.compare(that.getMotorSpeedRegulation(), getMotorSpeedRegulation()) == 0 && Double.compare(that.getCleaningWidth(), getCleaningWidth()) == 0 && Objects.equals(getFilterType(), that.getFilterType()) && Objects.equals(getBagType(), that.getBagType()) && Objects.equals(getWandType(), that.getWandType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getFilterType(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
