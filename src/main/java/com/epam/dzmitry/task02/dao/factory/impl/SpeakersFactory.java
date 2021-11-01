package com.epam.dzmitry.task02.dao.factory.impl;

import com.epam.dzmitry.task02.dao.factory.ApplianceFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.speakers.Speakers;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SpeakersFactory extends ApplianceFactory {

    private double price;

    private double powerConsumption;

    private double numberOfSpeakers;

    private double cordLength;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String searchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Speakers.valueOf(searchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case NUMBER_OF_SPEAKERS -> numberOfSpeakers = Double.parseDouble(value);
                    case CORD_LENGTH -> cordLength = Double.parseDouble(value);
                }
            }
        }
        return new Speakers(price, powerConsumption, numberOfSpeakers, cordLength);
    }
}