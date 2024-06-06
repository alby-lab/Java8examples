package com.demo.observerpatter.listener;

import java.io.File;

public class EmailNotificationListener implements EventListener{

	
	private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }
	@Override
	public void update(String eventType, File file) {
		// TODO Auto-generated method stub
		System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());	
	}

}
