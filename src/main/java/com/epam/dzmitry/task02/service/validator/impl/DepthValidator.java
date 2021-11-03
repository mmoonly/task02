package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class DepthValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double depth = (Double) value;
            return ((depth > 0) && (depth < 250));
        } else {
            return false;
        }
    }
}
