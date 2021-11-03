package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.entity.laptop.CPU;
import com.epam.dzmitry.task02.service.validator.Validator;

public class CPUValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}