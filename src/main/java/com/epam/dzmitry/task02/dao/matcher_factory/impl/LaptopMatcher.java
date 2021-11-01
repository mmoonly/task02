package com.epam.dzmitry.task02.dao.matcher_factory.impl;

import com.epam.dzmitry.task02.dao.matcher_factory.ApplianceMatcherFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.laptop.CPU;
import com.epam.dzmitry.task02.entity.laptop.Laptop;
import com.epam.dzmitry.task02.entity.laptop.OS;

public class LaptopMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Laptop laptop = (Laptop) appliance;

        return switch (SearchCriteria.Laptop.valueOf(criteriaName)) {
            case PRICE -> laptop.getPrice() == (double) value;
            case OS -> laptop.getOs().equals(OS.valueOf((String) value));
            case BATTERY_CAPACITY -> laptop.getBatteryCapacity() == (double) value;
            case MEMORY_ROM -> laptop.getMemoryRom() == (double) value;
            case SYSTEM_MEMORY -> laptop.getSystemMemory() == (double) value;
            case CPU -> laptop.getCpu().equals(CPU.valueOf((String) value));
            case DISPLAY_SIZE -> laptop.getDisplaySize() == (double) value;
        };
    }
}