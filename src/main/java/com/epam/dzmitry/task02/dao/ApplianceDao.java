package com.epam.dzmitry.task02.dao;

import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import com.epam.dzmitry.task02.exception.CustomException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public interface ApplianceDao {

    List<Appliance> find(Criteria criteria);

    void add(String applianceName, Appliance appliance);
}
