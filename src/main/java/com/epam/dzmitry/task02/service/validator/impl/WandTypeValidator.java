package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.entity.vacuumcleaner.WandType;
import com.epam.dzmitry.task02.service.validator.Validator;

public class WandTypeValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            WandType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
