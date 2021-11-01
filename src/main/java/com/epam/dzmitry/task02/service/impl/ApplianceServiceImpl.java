package com.epam.dzmitry.task02.service.impl;

import com.epam.dzmitry.task02.dao.ApplianceDao;
import com.epam.dzmitry.task02.dao.DaoFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import com.epam.dzmitry.task02.service.ApplianceService;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ParserConfigurationException, IOException, SAXException {
        List<Appliance> appliances;
        DaoFactory factory = DaoFactory.getInstance();
        ApplianceDao applianceDAO = factory.getApplianceDao();
        appliances = applianceDAO.find(criteria);
        return appliances;
    }

    @Override
    public void add(String applianceName, Appliance appliance) throws ParserConfigurationException, IOException, TransformerException, SAXException {
        DaoFactory factory = DaoFactory.getInstance();
        ApplianceDao applianceDAO = factory.getApplianceDao();
        applianceDAO.add(applianceName, appliance);
    }
}
