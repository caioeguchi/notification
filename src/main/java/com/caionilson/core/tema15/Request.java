package com.caionilson.core.tema15;

public class Request {

	public Notification notification;

	public Request() {
	}

	public Request(Notification notification) {
		this.notification = notification;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}
}
