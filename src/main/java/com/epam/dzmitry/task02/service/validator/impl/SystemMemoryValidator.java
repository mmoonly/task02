package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class SystemMemoryValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double systemMemory = (Double) value;
            return ((systemMemory > 0) && (systemMemory < 1000000));
        } else {
            return false;
        }
    }
}