package com.swampus.cooding.misc;

public class Command extends Thread {
    private long sleepTime;
    private String expectedResult;
    private String result = "in progress...";

    public Command(long sleepTime, String expectedResult){
        this.sleepTime = sleepTime;
        this.expectedResult = expectedResult;
    }

    public String getResult() {
        return result;
    }

    @Override
    public void run() {
        try {
            sleep(sleepTime);
            result = expectedResult;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
