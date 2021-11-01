package com.epam.dzmitry.task02.dao.factory.impl;

import com.epam.dzmitry.task02.dao.factory.ApplianceFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.laptop.CPU;
import com.epam.dzmitry.task02.entity.laptop.Laptop;
import com.epam.dzmitry.task02.entity.laptop.OS;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LaptopFactory extends ApplianceFactory {

    private double price;

    private OS os;

    private double batteryCapacity;

    private double memoryRom;

    private double systemMemory;

    private CPU cpu;

    private double displaySize;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String searchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Laptop.valueOf(searchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case OS -> os = OS.valueOf(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case MEMORY_ROM -> memoryRom = Double.parseDouble(value);
                    case SYSTEM_MEMORY -> systemMemory = Double.parseDouble(value);
                    case CPU -> cpu = CPU.valueOf(value);
                    case DISPLAY_SIZE -> displaySize = Double.parseDouble(value);
                }
            }
        }
        return new Laptop(price, os, batteryCapacity, memoryRom, systemMemory, cpu, displaySize);
    }
}
