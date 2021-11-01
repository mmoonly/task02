package com.epam.dzmitry.task02.dao.matcher_factory.impl;

import com.epam.dzmitry.task02.dao.matcher_factory.ApplianceMatcherFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.vacuumcleaner.BagType;
import com.epam.dzmitry.task02.entity.vacuumcleaner.FilterType;
import com.epam.dzmitry.task02.entity.vacuumcleaner.VacuumCleaner;
import com.epam.dzmitry.task02.entity.vacuumcleaner.WandType;

public class VacuumCleanerMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

        return switch (SearchCriteria.VacuumCleaner.valueOf(criteriaName)) {
            case PRICE -> vacuumCleaner.getPrice() == (double) value;
            case POWER_CONSUMPTION -> vacuumCleaner.getPowerConsumption() == (double) value;
            case FILTER_TYPE -> vacuumCleaner.getFilterType().equals(FilterType.valueOf((String) value));
            case BAG_TYPE -> vacuumCleaner.getBagType().equals(BagType.valueOf((String) value));
            case WAND_TYPE -> vacuumCleaner.getWandType().equals(WandType.valueOf((String) value));
            case MOTOR_SPEED_REGULATION -> vacuumCleaner.getMotorSpeedRegulation() == (double) value;
            case CLEANING_WIDTH -> vacuumCleaner.getCleaningWidth() == (double) value;
        };
    }
}
