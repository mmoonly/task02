package com.epam.dzmitry.task02.dao.impl;

import com.epam.dzmitry.task02.dao.ApplianceDao;
import com.epam.dzmitry.task02.dao.constant.ResourceConstant;
import com.epam.dzmitry.task02.dao.factory.ApplianceFactory;
import com.epam.dzmitry.task02.dao.matcher_factory.ApplianceMatcherFactory;
import com.epam.dzmitry.task02.dao.xml_factory.ApplianceXMLFactory;
import com.epam.dzmitry.task02.entity.Appliance;
import com.epam.dzmitry.task02.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApplianceDaoImpl implements ApplianceDao {

    @Override
    public List<Appliance> find(Criteria criteria) throws ParserConfigurationException, IOException, SAXException {
        List<Appliance> appliances = new ArrayList<>();
        Document document = getDocument(ResourceConstant.DB_XML.getFileName());
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                String modifiedNodeName = node.getNodeName().toUpperCase().replace('-', '_');
                if (criteria.getGroupSearchName().isEmpty() || criteria.getGroupSearchName().equals(modifiedNodeName)) {
                    ApplianceFactory applianceFactory = ApplianceFactory.getApplianceFactory(modifiedNodeName);
                    Appliance appliance = applianceFactory.createAppliance(node.getChildNodes());
                    if (criteria.getCriteria()
                            .entrySet()
                            .stream()
                            .allMatch(entry -> ApplianceMatcherFactory.getMatcher(modifiedNodeName).isMatchesCriteria(appliance, entry.getKey(), entry.getValue()))) {
                        appliances.add(appliance);
                    }
                }
            }
        }
        return appliances;
    }

    @Override
    public void add(String applianceName, Appliance appliance) throws TransformerException, ParserConfigurationException, IOException, SAXException {
        Document document = getDocument(ResourceConstant.DB_XML.getFileName());
        Element root = document.getDocumentElement();
        String modifiedApplianceName = applianceName.toUpperCase().replace('-', '_');

        root.appendChild(ApplianceXMLFactory.getApplianceXMLFactory(modifiedApplianceName).createApplianceXML(document, appliance));

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        Source source = new DOMSource(document);
        StreamResult result = new StreamResult(Objects.requireNonNull(getClass().getClassLoader().getResource(ResourceConstant.DB_XML.getFileName())).getFile());
        transformer.transform(source, result);
    }

    private Document getDocument(String fileName) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(Objects.requireNonNull(getClass().getClassLoader().getResource(fileName)).getFile());
        document.getDocumentElement().normalize();
        return document;
    }
}
