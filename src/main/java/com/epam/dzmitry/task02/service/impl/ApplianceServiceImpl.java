package com.epam.dzmitry.task02.service.impl;

import com.epam.dzmitry.task02.dao.ApplianceDao;
import com.epam.dzmitry.task02.dao.DaoFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import com.epam.dzmitry.task02.exception.CustomException;
import com.epam.dzmitry.task02.service.ApplianceService;
import com.epam.dzmitry.task02.service.validator.CriteriaValidator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!CriteriaValidator.isCriteriaValid(criteria)) {
            //log
            throw new CustomException("Criteria is not valid");
        }
        List<Appliance> appliances;
        DaoFactory factory = DaoFactory.getInstance();
        ApplianceDao applianceDAO = factory.getApplianceDao();
        appliances = applianceDAO.find(criteria);
        return appliances;
    }

    @Override
    public void add(String applianceName, Appliance appliance) {
        DaoFactory factory = DaoFactory.getInstance();
        ApplianceDao applianceDAO = factory.getApplianceDao();
        applianceDAO.add(applianceName, appliance);
    }
}
