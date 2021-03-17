package com.swampus.cooding.misc;

public class Operation {
    private String id;
    private Long amount;

    public Operation(String id, Long amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public Long getAmount() {
        return amount;
    }
}
