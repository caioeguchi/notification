package com.caionilson.core.tema15;

import com.caionilson.core.tema15.chain.ChatNotificationHandler;
import com.caionilson.core.tema15.chain.EmailNotificationHandler;
import com.caionilson.core.tema15.chain.NotificationHandler;
import com.caionilson.core.tema15.chain.SmsNotificationHandler;

public class Main {

	private static final Notification EMAIL = Notification.EMAIL;
	private static final Notification CHAT = Notification.CHAT;
	private static final Notification SMS = Notification.SMS;

	public static void main(String[] args) {

		NotificationHandler email = new EmailNotificationHandler(null);
		NotificationHandler chat = new ChatNotificationHandler(email);
		NotificationHandler sms = new SmsNotificationHandler(chat);

		Request request1 = new Request(EMAIL);
		Request request2 = new Request(CHAT);
		Request request3 = new Request(SMS);

		sms.sendNotification(request1);
		sms.sendNotification(request2);
		sms.sendNotification(request3);
	}
}
