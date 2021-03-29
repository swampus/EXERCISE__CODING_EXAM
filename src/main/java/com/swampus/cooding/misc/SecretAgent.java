package com.swampus.cooding.misc;

public class SecretAgent {

    private final String somethingFinal = "345";
    private String behaivor;

    public SecretAgent(String behaivor) {
        this.behaivor = behaivor;
    }

    public String getPhrase() {
        if (behaivor.equals("Q")) {
            throw new NumberFormatException("No ACCESS");
        }
        return behaivor;
    }

    private String sValue = "T2";
}
