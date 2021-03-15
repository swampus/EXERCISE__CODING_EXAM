package com.swampus.cooding.misc;

import java.io.IOException;

public class DConnectionManager {

    private String abc;

    public void connect() throws IOException {
        abc = "OK";
    }

    public String getAbc() {
        return abc;
    }
}
