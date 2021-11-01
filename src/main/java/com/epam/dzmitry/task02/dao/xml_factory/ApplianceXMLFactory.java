package com.epam.dzmitry.task02.dao.xml_factory;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.dao.xml_factory.impl.*;
import com.epam.dzmitry.task02.entity.Appliance;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ApplianceXMLFactory {

    public abstract Node createApplianceXML(Document document, Appliance appliance);

    protected final Node createElement(Document document, String fieldTagName, Object value) {
        Element node = document.createElement(fieldTagName.toLowerCase().replace('_', '-'));
        node.appendChild(document.createTextNode(String.valueOf(value)));
        return node;
    }

    public static ApplianceXMLFactory getApplianceXMLFactory(String applianceName){

        return switch (ApplianceName.valueOf(applianceName)) {
            case LAPTOP -> new LaptopXMLFactory();
            case OVEN -> new OvenXMLFactory();
            case REFRIGERATOR -> new RefrigeratorXMLFactory();
            case SPEAKERS -> new SpeakersXMLFactory();
            case TABLET_PC -> new TabletPCXMLFactory();
            case VACUUM_CLEANER -> new VacuumCleanerXMLFactory();
        };
    }
}
