package com.caionilson.core.tema15.chain;

import java.util.Objects;

import com.caionilson.core.tema15.Request;

public abstract class NotificationHandler {

	private NotificationHandler next;

	public NotificationHandler(NotificationHandler next) {
		this.next = next;
	}

	public abstract void sendNotification(Request request);

	public void nextNotification(Request request) {
		if (Objects.nonNull(this.next))
			this.next.sendNotification(request);
	}
}
