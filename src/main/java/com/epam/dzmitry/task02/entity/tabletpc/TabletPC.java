package com.epam.dzmitry.task02.entity.tabletpc;

import com.epam.dzmitry.task02.entity.Appliance;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends Appliance implements Serializable {

    private Color color;

    private double batteryCapacity;

    private double memoryRom;

    private double flashMemoryCapacity;

    private double displaySize;

    public TabletPC() {
    }

    public TabletPC(double price, Color color, double batteryCapacity, double memoryRom, double flashMemoryCapacity, double displaySize) {
        super(price);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.displaySize = displaySize;
    }

    public Color getColor() {
        return color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.getBatteryCapacity(), getBatteryCapacity()) == 0 && Double.compare(tabletPC.getMemoryRom(), getMemoryRom()) == 0 && Double.compare(tabletPC.getFlashMemoryCapacity(), getFlashMemoryCapacity()) == 0 && Double.compare(tabletPC.getDisplaySize(), getDisplaySize()) == 0 && Objects.equals(getColor(), tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor(), getBatteryCapacity(), getMemoryRom(), getFlashMemoryCapacity(), getDisplaySize());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "color='" + color + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", displaySize=" + displaySize +
                '}';
    }
}
