package com.rso.aar.persistence.dao;

import java.math.BigInteger;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.rso.aar.persistence.DatabaseTablenamePrefix;

public class Sequence {

    private String name;

    @Autowired
    private DatabaseTablenamePrefix databaseTablenamePrefix;

    public Sequence(String name) {
        this.name = name;
    }

    public BigInteger getNextValue(Session session) {
        String queryString = "select nextval('" + databaseTablenamePrefix.getValue() + name + "')";
        return (BigInteger) session.createSQLQuery(queryString).uniqueResult();
    }
}
