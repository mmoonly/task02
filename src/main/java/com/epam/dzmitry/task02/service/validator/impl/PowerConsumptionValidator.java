package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class PowerConsumptionValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double powerConsumption = (Double) value;
            return ((powerConsumption > 0) && (powerConsumption < 150000.0));
        } else {
            return false;
        }
    }
}
