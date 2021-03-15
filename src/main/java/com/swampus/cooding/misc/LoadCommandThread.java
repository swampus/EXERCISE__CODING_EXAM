package com.swampus.cooding.misc;

public class LoadCommandThread extends Thread {
    private String status = "in process";

    @Override
    public void run() {
        try {
            sleep(2000);
            status = "done";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getStatus() {
        return status;
    }
}
