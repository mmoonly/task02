package com.epam.dzmitry.task02.service.validator.impl;

import com.epam.dzmitry.task02.service.validator.Validator;

public class MemoryRomValidator implements Validator {

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double memoryRom = (Double) value;
            return ((memoryRom > 0) && (memoryRom < 1000000));
        } else {
            return false;
        }
    }
}
