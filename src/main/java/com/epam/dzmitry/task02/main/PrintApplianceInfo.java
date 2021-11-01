package com.epam.dzmitry.task02.main;

import com.epam.dzmitry.task02.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliances) {
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}
