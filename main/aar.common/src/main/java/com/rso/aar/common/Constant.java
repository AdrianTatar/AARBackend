package com.rso.aar.common;

import java.nio.charset.Charset;

public final class Constant {

    public static final String ZONE = System.getProperty("zone");

    public static final Charset FILE_ENCODING = Charset.forName(System.getProperty("file.encoding"));

    public static final Object LINE_SEPARATOR = System.getProperty("line.separator");

    //public static final String JETTY_PORT = System.getProperty("jetty.port");

    private Constant() {
    }

}