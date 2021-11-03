package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class DisplaySizeValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double displayInches = (Double) value;
            return ((displayInches > 0) && (displayInches < 40));
        } else {
            return false;
        }
    }
}
