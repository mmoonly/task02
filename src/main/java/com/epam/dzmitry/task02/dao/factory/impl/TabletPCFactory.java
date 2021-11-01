package com.epam.dzmitry.task02.dao.factory.impl;

import com.epam.dzmitry.task02.dao.factory.ApplianceFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.tabletpc.Color;
import com.epam.dzmitry.task02.entity.tabletpc.TabletPC;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TabletPCFactory extends ApplianceFactory {

    private double price;

    private Color color;

    private double batteryCapacity;

    private double memoryRom;

    private double flashMemoryCapacity;

    private double displaySize;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String searchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.TabletPC.valueOf(searchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case COLOR -> color = Color.valueOf(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case MEMORY_ROM -> memoryRom = Double.parseDouble(value);
                    case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity = Double.parseDouble(value);
                    case DISPLAY_SIZE -> displaySize = Double.parseDouble(value);
                }
            }
        }
        return new TabletPC(price, color, batteryCapacity, memoryRom, flashMemoryCapacity, displaySize);
    }
}
