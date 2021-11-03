package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.entity.vacuumcleaner.FilterType;
import com.epam.dzmitry.task02.service.validator.Validator;

public class FilterTypeValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
