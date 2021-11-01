package com.epam.dzmitry.task02.dao.factory.impl;

import com.epam.dzmitry.task02.dao.factory.ApplianceFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.oven.Oven;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OvenFactory extends ApplianceFactory {

    private double price;

    private double powerConsumption;

    private double weight;

    private double capacity;

    private double depth;

    private double height;

    private double width;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String searchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Oven.valueOf(searchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case WEIGHT -> weight = Double.parseDouble(value);
                    case CAPACITY -> capacity = Double.parseDouble(value);
                    case DEPTH -> depth = Double.parseDouble(value);
                    case HEIGHT -> height = Double.parseDouble(value);
                    case WIDTH -> width = Double.parseDouble(value);
                }
            }
        }
        return new Oven(price, powerConsumption, weight, capacity, depth, height, width);
    }
}
