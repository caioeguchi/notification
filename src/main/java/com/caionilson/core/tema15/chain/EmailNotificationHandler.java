package com.caionilson.core.tema15.chain;

import com.caionilson.core.tema15.Notification;
import com.caionilson.core.tema15.Request;

public class EmailNotificationHandler extends NotificationHandler {

	public EmailNotificationHandler(NotificationHandler next) {
		super(next);
	}
	
	@Override
	public void sendNotification(Request request) {
		if (request.notification == Notification.EMAIL) {
			System.out.println("New e-mail");
		}
		nextNotification(request);
	}
}
