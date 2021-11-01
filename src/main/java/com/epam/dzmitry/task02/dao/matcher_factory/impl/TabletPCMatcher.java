package com.epam.dzmitry.task02.dao.matcher_factory.impl;

import com.epam.dzmitry.task02.dao.matcher_factory.ApplianceMatcherFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.tabletpc.Color;
import com.epam.dzmitry.task02.entity.tabletpc.TabletPC;

public class TabletPCMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        TabletPC tabletPC = (TabletPC) appliance;

        return switch (SearchCriteria.TabletPC.valueOf(criteriaName)) {
            case PRICE -> tabletPC.getPrice() == (double) value;
            case BATTERY_CAPACITY -> tabletPC.getBatteryCapacity() == (double) value;
            case DISPLAY_SIZE -> tabletPC.getDisplaySize() == (double) value;
            case MEMORY_ROM -> tabletPC.getMemoryRom() == (double) value;
            case FLASH_MEMORY_CAPACITY -> tabletPC.getFlashMemoryCapacity() == (double) value;
            case COLOR -> tabletPC.getColor().equals(Color.valueOf((String) value));
        };
    }
}
