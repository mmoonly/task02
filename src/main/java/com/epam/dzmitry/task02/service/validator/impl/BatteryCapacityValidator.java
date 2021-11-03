package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class BatteryCapacityValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double batteryCapacity = (Double) value;
            return ((batteryCapacity > 0) && (batteryCapacity < 10000));
        } else {
            return false;
        }
    }
}
