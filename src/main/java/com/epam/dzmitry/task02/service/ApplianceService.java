package com.epam.dzmitry.task02.service;

import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria);

    void add(String applianceName, Appliance appliance);
}
