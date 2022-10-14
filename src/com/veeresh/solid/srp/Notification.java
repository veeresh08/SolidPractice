package com.veeresh.solid.srp;

public class Notification {
	public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //write logic using twillio API
        }
    }
}
