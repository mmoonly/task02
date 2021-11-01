package com.epam.dzmitry.task02.dao.xml_factory.impl;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.dao.xml_factory.ApplianceXMLFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.laptop.Laptop;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class LaptopXMLFactory extends ApplianceXMLFactory {
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Laptop laptop = (Laptop) appliance;
        Element laptopElement = document.createElement(ApplianceName.LAPTOP.name().toLowerCase().replace('_', '-'));

        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.PRICE.name(), laptop.getPrice()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.OS.name(), String.valueOf(laptop.getOs())));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.BATTERY_CAPACITY.name(), laptop.getBatteryCapacity()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.MEMORY_ROM.name(), laptop.getMemoryRom()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.SYSTEM_MEMORY.name(), laptop.getSystemMemory()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.CPU.name(), laptop.getCpu()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.DISPLAY_SIZE.name(), laptop.getDisplaySize()));

        return laptopElement;
    }
}
