package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.entity.tabletpc.Color;
import com.epam.dzmitry.task02.service.validator.Validator;

public class ColorValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
