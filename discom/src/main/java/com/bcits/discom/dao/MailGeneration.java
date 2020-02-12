package com.bcits.discom.dao;

import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;

public class MailGeneration {

	public void sendMail(CurrentBillBean currentBill, ConsumerMasterBean consumerBean) {

		System.out.println("Sending Mail...");

		final String username = "veeksha2010@gmail.com";
		final String password = "Geetha121*";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String dueDate = dateFormat.format(currentBill.getDueDate());
		String date = dateFormat.format(currentBill.getDate());

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(consumerBean.getEmail()));
			message.setSubject("DESCOM Online Services");
			message.setText("Dear "+consumerBean.getFullName()+","
					+ "\n Kindly pay your Current Bill "+currentBill.getTotalAmount()
					+ "\n On or before "+currentBill.getDueDate()
					+ "\n "
					+ "\n Your Current Bill Deatails"
					+ "\n --------------------------"
					+ "\n Your RR Number is "+currentBill.getRrNumber()
					+ "\n Month  : "+currentBill.getMonth()
					+ "\n Initial Reading  : "+currentBill.getInitialReading()
					+ "\n Final Reading  : "+currentBill.getFinalReading()
					+ "\n Units Consumed  : "+currentBill.getUnitsConsumed()
					+ "\n Total Amount  : "+currentBill.getTotalAmount()
					+ "\n Region  : "+currentBill.getRegion()
					+ "\n "
					+ "\n Thank You");

			Transport.send(message);

			System.out.println("Done");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}


