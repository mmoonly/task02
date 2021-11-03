package com.epam.dzmitry.task02.main;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.speakers.Speakers;
import com.epam.dzmitry.task02.service.ApplianceService;
import com.epam.dzmitry.task02.service.ServiceFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Appliance> appliances;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Criteria oven = new Criteria(ApplianceName.OVEN.name());
        oven.add(SearchCriteria.Oven.PRICE.name(), 100.0);
        appliances = service.find(oven);
        PrintApplianceInfo.print(appliances);

        Criteria laptop = new Criteria(ApplianceName.LAPTOP.name());
        laptop.add(SearchCriteria.Laptop.OS.name(), "WINDOWS");
        appliances = service.find(laptop);
        PrintApplianceInfo.print(appliances);

       service.add(ApplianceName.SPEAKERS.name(), new Speakers(1000.0, 500.0, 4.0, 12.0));

        Criteria speakers = new Criteria(ApplianceName.SPEAKERS.name());
        speakers.add(SearchCriteria.Speakers.POWER_CONSUMPTION.name(), 500.0);
        speakers.add(SearchCriteria.Speakers.CORD_LENGTH.name(), 12.0);
        speakers.add(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(), 4.0);
        appliances = service.find(speakers);
        PrintApplianceInfo.print(appliances);
    }
}
