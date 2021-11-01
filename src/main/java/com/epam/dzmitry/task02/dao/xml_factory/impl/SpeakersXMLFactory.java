package com.epam.dzmitry.task02.dao.xml_factory.impl;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.dao.xml_factory.ApplianceXMLFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.speakers.Speakers;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class SpeakersXMLFactory extends ApplianceXMLFactory {
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Speakers speakers = (Speakers) appliance;
        Element speakersElement = document.createElement(ApplianceName.SPEAKERS.name().toLowerCase().replace('_', '-'));

        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.PRICE.name(), speakers.getPrice()));
        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.POWER_CONSUMPTION.name(), speakers.getPowerConsumption()));
        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(), speakers.getNumberOfSpeakers()));
        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.CORD_LENGTH.name(), speakers.getCordLength()));

        return speakersElement;
    }
}