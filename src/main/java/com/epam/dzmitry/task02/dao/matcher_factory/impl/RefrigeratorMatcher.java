package com.epam.dzmitry.task02.dao.matcher_factory.impl;

import com.epam.dzmitry.task02.dao.matcher_factory.ApplianceMatcherFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.refrigerator.Refrigerator;

public class RefrigeratorMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Refrigerator refrigerator = (Refrigerator) appliance;

        return switch (SearchCriteria.Refrigerator.valueOf(criteriaName)) {
            case PRICE -> refrigerator.getPrice() == (double) value;
            case POWER_CONSUMPTION -> (double) value == refrigerator.getPowerConsumption();
            case WEIGHT -> refrigerator.getWeight() == (double) value;
            case FREEZER_CAPACITY -> refrigerator.getFreezerCapacity() == (double) value;
            case OVERALL_CAPACITY -> refrigerator.getOverallCapacity() == (double) value;
            case HEIGHT -> refrigerator.getHeight() == (double) value;
            case WIDTH -> refrigerator.getWidth() == (double) value;
        };
    }
}
