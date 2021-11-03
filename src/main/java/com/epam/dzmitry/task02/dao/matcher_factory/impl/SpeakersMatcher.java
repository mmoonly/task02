package com.epam.dzmitry.task02.dao.matcher_factory.impl;

import com.epam.dzmitry.task02.dao.matcher_factory.ApplianceMatcherFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.speakers.Speakers;

public class SpeakersMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Speakers speakers = (Speakers) appliance;

        return switch (SearchCriteria.Speakers.valueOf(criteriaName)) {
            case PRICE -> speakers.getPrice() == (double) value;
            case POWER_CONSUMPTION -> (double) value == speakers.getPowerConsumption();
            case NUMBER_OF_SPEAKERS -> (double) value == speakers.getNumberOfSpeakers();
            case CORD_LENGTH -> (double) value == speakers.getCordLength();
        };
    }
}