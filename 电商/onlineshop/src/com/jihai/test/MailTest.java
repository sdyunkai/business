package com.jihai.test;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.jihai.utils.MailUtils;

public class MailTest {
	public static void main(String[] args) throws AddressException, MessagingException {
		MailUtils.sendMail("it_liuyong@163.com", "sdfhello");
	}
}
