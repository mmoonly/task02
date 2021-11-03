package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class CordLengthValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double cordLength = (Double) value;
            return ((cordLength > 0) && (cordLength < 99));
        } else {
            return false;
        }
    }
}