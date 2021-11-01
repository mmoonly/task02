package com.epam.dzmitry.task02.entity.laptop;

import com.epam.dzmitry.task02.entity.Appliance;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {

    private OS os;

    private double batteryCapacity;

    private double memoryRom;

    private double systemMemory;

    private CPU cpu;

    private double displaySize;

    public Laptop() {
    }

    public Laptop(double price, OS os, double batteryCapacity, double memoryRom, double systemMemory, CPU cpu, double displaySize) {
        super(price);
        this.os = os;
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displaySize = displaySize;
    }

    public OS getOs() {
        return os;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0 && Double.compare(laptop.getMemoryRom(), getMemoryRom()) == 0 && Double.compare(laptop.getSystemMemory(), getSystemMemory()) == 0 && Double.compare(laptop.getDisplaySize(), getDisplaySize()) == 0 && getOs() == laptop.getOs() && getCpu() == laptop.getCpu();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOs(), getBatteryCapacity(), getMemoryRom(), getSystemMemory(), getCpu(), getDisplaySize());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displaySize=" + displaySize +
                '}';
    }
}
