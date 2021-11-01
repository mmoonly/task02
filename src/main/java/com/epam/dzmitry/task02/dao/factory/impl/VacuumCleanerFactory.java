package com.epam.dzmitry.task02.dao.factory.impl;

import com.epam.dzmitry.task02.dao.factory.ApplianceFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.vacuumcleaner.BagType;
import com.epam.dzmitry.task02.entity.vacuumcleaner.FilterType;
import com.epam.dzmitry.task02.entity.vacuumcleaner.VacuumCleaner;
import com.epam.dzmitry.task02.entity.vacuumcleaner.WandType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VacuumCleanerFactory extends ApplianceFactory {

    private double price;

    private double powerConsumption;

    private FilterType filterType;

    private BagType bagType;

    private WandType wandType;

    private double motorSpeedRegulation;

    private double cleaningWidth;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String searchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.VacuumCleaner.valueOf(searchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case FILTER_TYPE -> filterType = FilterType.valueOf(value);
                    case BAG_TYPE -> bagType = BagType.valueOf(value);
                    case WAND_TYPE -> wandType = WandType.valueOf(value);
                    case MOTOR_SPEED_REGULATION -> motorSpeedRegulation = Double.parseDouble(value);
                    case CLEANING_WIDTH -> cleaningWidth = Double.parseDouble(value);
                }
            }
        }
        return new VacuumCleaner(price, powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
