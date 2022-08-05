package com.caionilson.core.tema15;

import org.junit.Test;

import com.caionilson.core.tema15.chain.ChatNotificationHandler;
import com.caionilson.core.tema15.chain.EmailNotificationHandler;
import com.caionilson.core.tema15.chain.SmsNotificationHandler;

import junit.framework.Assert;

public class RequestTest {

	private Request request;

	@Test
	public void emailNotification() {
		request = new Request("email");
		Assert.assertTrue(request.getNotification() instanceof EmailNotificationHandler);
	}

	@Test
	public void smsNotification() {
		request = new Request("sms");
		Assert.assertTrue(request.getNotification() instanceof SmsNotificationHandler);
	}

	@Test
	public void chatNotification() {
		request = new Request("chat");
		Assert.assertTrue(request.getNotification() instanceof ChatNotificationHandler);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidOperation() {
		request = new Request("a");
		request.getNotification();
	}
}