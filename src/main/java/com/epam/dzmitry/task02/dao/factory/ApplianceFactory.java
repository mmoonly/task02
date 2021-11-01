package com.epam.dzmitry.task02.dao.factory;


import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.dao.factory.impl.*;
import com.epam.dzmitry.task02.entity.Appliance;
import org.w3c.dom.NodeList;

public abstract class ApplianceFactory {

    public abstract Appliance createAppliance(NodeList nodeList);

    public static ApplianceFactory getApplianceFactory(String applianceName) {
        return switch (ApplianceName.valueOf(applianceName)) {
            case LAPTOP -> new LaptopFactory();
            case OVEN -> new OvenFactory();
            case REFRIGERATOR -> new RefrigeratorFactory();
            case SPEAKERS -> new SpeakersFactory();
            case TABLET_PC -> new TabletPCFactory();
            case VACUUM_CLEANER -> new VacuumCleanerFactory();
        };
    }
}
