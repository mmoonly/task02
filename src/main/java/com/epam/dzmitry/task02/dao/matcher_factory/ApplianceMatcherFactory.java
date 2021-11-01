package com.epam.dzmitry.task02.dao.matcher_factory;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.dao.matcher_factory.impl.*;
import com.epam.dzmitry.task02.entity.Appliance;

public abstract class ApplianceMatcherFactory {

    public abstract boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value);

    public static ApplianceMatcherFactory getMatcher(String applianceName) throws EnumConstantNotPresentException {

        return switch (ApplianceName.valueOf(applianceName)) {
            case LAPTOP -> new LaptopMatcher();
            case OVEN -> new OvenMatcher();
            case REFRIGERATOR -> new RefrigeratorMatcher();
            case SPEAKERS -> new SpeakersMatcher();
            case TABLET_PC -> new TabletPCMatcher();
            case VACUUM_CLEANER -> new VacuumCleanerMatcher();
        };
    }
}
