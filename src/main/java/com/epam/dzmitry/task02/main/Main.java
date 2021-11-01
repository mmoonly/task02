package com.epam.dzmitry.task02.main;

import com.epam.dzmitry.task02.dao.constant.ApplianceName;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import com.epam.dzmitry.task02.entity.criteria.SearchCriteria;
import com.epam.dzmitry.task02.entity.speakers.Speakers;
import com.epam.dzmitry.task02.service.ApplianceService;
import com.epam.dzmitry.task02.service.ServiceFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {

        List<Appliance> appliances;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Criteria criteriaSpeakers = new Criteria(ApplianceName.SPEAKERS.name());
        criteriaSpeakers.add(SearchCriteria.Speakers.PRICE.name(), 400.0);
        appliances = service.find(criteriaSpeakers);
        PrintApplianceInfo.print(appliances);

        Criteria criteriaLaptop = new Criteria(ApplianceName.LAPTOP.name());
        criteriaLaptop.add(SearchCriteria.Laptop.OS.name(), "WINDOWS");
        appliances = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliances);

        service.add(ApplianceName.SPEAKERS.name(), new Speakers(1000.0, 500.0, 4, 12));
    }
}
