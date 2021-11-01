package com.epam.dzmitry.task02.dao.constant;

public enum ResourceConstant {
    DB_XML("db.xml");

    private final String fileName;

    private ResourceConstant(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

