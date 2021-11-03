package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class CleaningWidthValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double cleaningWidth = (Double) value;
            return ((cleaningWidth > 0) && (cleaningWidth < 1000));
        } else {
            return false;
        }
    }
}
