package com.caionilson.core.tema15.chain;

import com.caionilson.core.tema15.Notification;
import com.caionilson.core.tema15.Request;

public class ChatNotificationHandler extends NotificationHandler {

	public ChatNotificationHandler(NotificationHandler next) {
		super(next);
	}

	@Override
	public void sendNotification(Request request) {
		if (request.notification == Notification.CHAT) {
			System.out.println("New message");
		}
		nextNotification(request);
	}
}
