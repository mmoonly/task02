package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class MotorSpeedRegulationValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double motorSpeedRegulation = (Double) value;
            return ((motorSpeedRegulation > 0) && (motorSpeedRegulation < 300000));
        } else {
            return false;
        }
    }
}
