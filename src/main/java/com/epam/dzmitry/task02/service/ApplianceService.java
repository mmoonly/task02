package com.epam.dzmitry.task02.service;

import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws ParserConfigurationException, IOException, SAXException;

    void add(String applianceName, Appliance appliance) throws ParserConfigurationException, IOException, TransformerException, SAXException;
}
