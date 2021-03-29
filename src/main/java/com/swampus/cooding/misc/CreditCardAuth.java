package com.swampus.cooding.misc;

public class CreditCardAuth extends Thread implements Cloneable{

    private String result = "in progress";
    private String authCode = "";

    public void setAuthCode(String code) {
        authCode = code;
    }

    public String getResult() {
        return result;
    }

    public String getAuthCode() {
        return authCode;
    }

    @Override
    public void run() {
        try {
            result = "IN PROGRESS";
            System.out.println("start auth with: " + authCode);
            sleep(1500);
            if (authCode.equals("3422")) {
                result = "SUCCESS";
            } else {
                result = "FAILED";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object clone() {
        CreditCardAuth creditCardAuth = new CreditCardAuth();
        creditCardAuth.setAuthCode(authCode);
        return creditCardAuth;
    }
}

