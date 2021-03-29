package com.swampus.cooding.misc;

public class DeltaConnector implements IConnector {

    @Override
    public void connect() {
        throw new RuntimeException("connect:: Failed! original method called");
    }

    @Override
    public void deltaAbstract() {
        throw new RuntimeException("deltaAbstract:: Failed! original method called");
    }

    @Override
    public Long cltOfffer() {
        return 17L;
    }
}
