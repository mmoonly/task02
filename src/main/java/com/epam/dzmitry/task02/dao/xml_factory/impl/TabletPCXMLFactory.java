package com.epam.dzmitry.task02.dao.xml_factory.impl;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.dao.xml_factory.ApplianceXMLFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.tabletpc.TabletPC;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class TabletPCXMLFactory extends ApplianceXMLFactory {
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        Element tabletPCElement = document.createElement(ApplianceName.TABLET_PC.name().toLowerCase().replace('_', '-'));

        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.PRICE.name(), tabletPC.getPrice()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.COLOR.name(), tabletPC.getColor()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), tabletPC.getBatteryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.MEMORY_ROM.name(), tabletPC.getMemoryRom()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), tabletPC.getFlashMemoryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.DISPLAY_SIZE.name(), tabletPC.getDisplaySize()));

        return tabletPCElement;
    }
}