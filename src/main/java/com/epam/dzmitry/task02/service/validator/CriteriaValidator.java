package com.epam.dzmitry.task02.service.validator;

import com.epam.dzmitry.task02.entity.criteria.Criteria;

public class CriteriaValidator {

    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteria().entrySet().stream().allMatch(
                entry -> ValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }
}

