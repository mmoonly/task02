package com.epam.dzmitry.task02.dao;

import com.epam.dzmitry.task02.dao.impl.ApplianceDaoImpl;

public final class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();

    private final ApplianceDao applianceDao = new ApplianceDaoImpl();

    public DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return instance;
    }

    public ApplianceDao getApplianceDao() {
        return applianceDao;
    }
}
