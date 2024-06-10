package com.virendra.utility;

import jakarta.mail.MessagingException;

public class MailMessage {

	public static void registrationSuccess(String emailId, String name) {
	    String recipient = emailId;
	    String subject = "Registration Successful";
	    String htmlTextMessage = "<html>"
	            + "<body style='font-family: Arial, sans-serif;'>"
	            + "<h2 style='color:green;'>Welcome to TechNest</h2>"
	            + "<p>Hi " + name + ",</p>"
	            + "<p>Welcome aboard to TechNest, your ultimate destination for all things tech!</p>"
	            + "<p>At TechNest, we strive to provide you with the latest and greatest in electronic appliances and gadgets. Whether you're looking for smartphones, laptops, TVs, or any other tech gear, we've got you covered.</p>"
	            + "<p>Explore our extensive collection and take advantage of our amazing offers. Enjoy up to 60% OFF on most gadgets and exclusive deals on your favorite brands.</p>"
	            + "<p>As a token of appreciation for joining our community, we're offering you an additional 10% OFF up to Rs 500 on your first purchase. Simply use the promo code below:</p>"
	            + "<p><strong>PROMO CODE: TECHNEST500</strong></p>"
	            + "<p>Don't miss out on our exclusive offers and deals. Stay tuned for regular updates and exciting promotions!</p>"
	            + "<img src='https://img1.wsimg.com/isteam/ip/0e01be0b-2aca-43ce-9121-360b7345ff28/TECHNEST-LOGO--158f8cd.jpeg' alt='TechNest' style='width: 200px; height: auto;' />"
	            + "<p>Thank you for choosing TechNest. We look forward to serving you and making your tech shopping experience delightful.</p>"
	            + "<p>Have a great day!</p>"
	            + "<p><strong style='color:green;'>TechNest Team</strong></p>"
	            + "</body>"
	            + "</html>";

	    try {
	        JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
	    } catch (MessagingException e) {
	        e.printStackTrace();
	    }
	}



    public static void transactionSuccess(String recipientEmail, String name, String transId, double transAmount) {
        String recipient = recipientEmail;
        String subject = "Order Placed at TechNest";
        String htmlTextMessage = "<html>"
                + "<body style='font-family: Arial, sans-serif;'>"
                + "<p>Hello " + name + ",</p>"
                + "<p>We are glad that you shop with TechNest!</p>"
                + "<p>Your order has been placed successfully and is being processed for shipment.</p>"
                + "<p>Here are your transaction details:</p>"
                + "<p><strong style='color: red;'>Order ID:</strong> <span style='color: green;'>" + transId + "</span></p>"
                + "<p><strong style='color: red;'>Amount Paid:</strong> <span style='color: green;'>" + transAmount + "</span></p>"
                + "<p>Thank you for shopping with us!</p>"
                + "<p>We look forward to serving you again.</p>"
                + "<p><strong style='color:green;'>TechNest</strong></p>"
                + "</body>"
                + "</html>";

        try {
            JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void orderShipped(String recipientEmail, String name, String transId, double transAmount) {
        String recipient = recipientEmail;
        String subject = "Your Order has been Shipped from TechNest";
        String htmlTextMessage = "<html>"
                + "<body style='font-family: Arial, sans-serif;'>"
                + "<p>Hello " + name + ",</p>"
                + "<p>We are pleased to inform you that your order has been shipped and is on its way.</p>"
                + "<p>Here are your transaction details:</p>"
                + "<p><strong style='color: red;'>Order ID:</strong> <span style='color: green;'>" + transId + "</span></p>"
                + "<p><strong style='color: red;'>Amount Paid:</strong> <span style='color: green;'>" + transAmount + "</span></p>"
                + "<p>Thank you for shopping with us!</p>"
                + "<p>We look forward to serving you again.</p>"
                + "<p><strong style='color:green;'>TechNest</strong></p>"
                + "</body>"
                + "</html>";

        try {
            JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void productAvailableNow(String recipientEmail, String name, String prodName, String prodId) {
        String recipient = recipientEmail;
        String subject = "Product " + prodName + " is Now Available at TechNest";
        String htmlTextMessage = "<html>"
                + "<body style='font-family: Arial, sans-serif;'>"
                + "<p>Hello " + name + ",</p>"
                + "<p>We are excited to inform you that the product you were looking for is now available.</p>"
                + "<p><strong style='color: green;'>" + prodName + "</strong> (Product ID: <strong style='color: green;'>" + prodId + "</strong>) is back in stock.</p>"
                + "<p>Thank you for shopping with us!</p>"
                + "<p>We look forward to serving you again.</p>"
                + "<p><strong style='color:green;'>TechNest</strong></p>"
                + "</body>"
                + "</html>";

        try {
            JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static String sendMessage(String toEmailId, String subject, String htmlTextMessage) {
        try {
            JavaMailUtil.sendMail(toEmailId, subject, htmlTextMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "FAILURE";
        }
        return "SUCCESS";
    }
}
