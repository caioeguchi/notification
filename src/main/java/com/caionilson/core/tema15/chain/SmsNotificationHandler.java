package com.caionilson.core.tema15.chain;

import com.caionilson.core.tema15.Notification;
import com.caionilson.core.tema15.Request;

public class SmsNotificationHandler extends NotificationHandler {

	public SmsNotificationHandler(NotificationHandler next) {
		super(next);
	}

	@Override
	public void sendNotification(Request request) {
		if (request.notification == Notification.SMS) {
			System.out.println("New SMS");
		}
		nextNotification(request);
	}
}
