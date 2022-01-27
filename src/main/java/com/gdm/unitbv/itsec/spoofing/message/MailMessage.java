package com.gdm.unitbv.itsec.spoofing.message;

import com.gdm.unitbv.itsec.spoofing.model.Credentials;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailMessage {

    public static Message getRandomMessage(Session session,
                                           Credentials credentials) throws Exception{
        javax.mail.Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(credentials.getEmailAddressSender()));
        message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(
                credentials.getEmailAddressRecipient()
        ));
        message.setSubject("VERY IMPORTANT EMAIL DO NOT IGNORE");
        String html = String.format("<h1> <b> ATTENTION! THIS EMAIL COMES FROM" +
                        " THE SECURITY TEAM IN THE IT DEPARTMENT" +
                        "</b> <h1>\n" +
                        "<br>\n" +
                        "<h4> YOUR COMPUTER HAS BEEN INFECTED WITH RANSOMWARE <h4>\n" +
                        "<br>\n" +
                        "<h3> <b>PLEASE SEND YOUR BANK ACCOUNTS INFORMATION TO THIS EMAIL ADDRESS %s " +
                        "SO WE CAN HELP YOU RECOVER THE STUFF ON YOUR COMPUTER WHICH" +
                        " HAS BEEN ENCRYPTED AND CANNOT BE " +
                        "DECRYPTED! </b> <h3>",
                credentials.getEmailAddressSender());
        message.setContent(html, "text/html");

        return message;
    }

    public static Message getAngryMessage(Session session,
                                          Credentials credentials) throws Exception{
        javax.mail.Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(credentials.getEmailAddressSender()));
        message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(
                credentials.getEmailAddressRecipient()));
        message.setSubject("VERY IMPORTANT EMAIL DO NOT IGNORE - ANGRY MESSAGE");
        String html = "<h1> <b> ATTENTION! THIS EMAIL COMES FROM" +
                        "THIS MESSAGE COMES FROM AN ANGRY AND MEAN MAN" +
                        "</b> <h1>\n" +
                        "<br>\n" +
                        "<h4> YOUR COMPUTER HAS BEEN INFECTED WITH A VERY MALICIOUS VIRUS <h4>\n" +
                        "<br>\n" +
                        "<h3> <b>SEND ME 100K US DOLLARS OR I WILL DELETE EVERYTHING FROM" +
                        "YOUR COMPUTER. I AM ANGRY I DO NOT JOKE ABOUT THIS! </b> <h3>";
        message.setContent(html, "text/html");

        return message;
    }

    public static Message getFunnyMessage(Session session,
                                          Credentials credentials) throws Exception{
        javax.mail.Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(credentials.getEmailAddressSender()));
        message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(
                credentials.getEmailAddressRecipient()));
        message.setSubject("VERY IMPORTANT EMAIL DO NOT IGNORE - ANGRY MESSAGE");
        String html = "<h1> <b> ATTENTION! THIS EMAIL COMES FROM" +
                "THIS MESSAGE COMES FROM A VERY FUNNY GUY THAT LIKES TO PRANK PEOPLE" +
                "</b> <h1>\n" +
                "<br>\n" +
                "<h4> YOUR COMPUTER HAS BEEN INFECTED WITH A VERY MALICIOUS VIRUS <h4>\n" +
                "<br>\n" +
                "<h3> <b>IF YOU LAUGH AT THIS JOKE I WILL UNVIRUS YOUR PC </b> <h3>" +
                "<p> KNOCK KNOCK <p>";
        message.setContent(html, "text/html");

        return message;
    }

    public static Message getNigeriaMessage(Session session,
                                          Credentials credentials) throws Exception{
        javax.mail.Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(credentials.getEmailAddressSender()));
        message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(
                credentials.getEmailAddressRecipient()));
        message.setSubject("VERY IMPORTANT EMAIL DO NOT IGNORE - ANGRY MESSAGE");
        String html = "<h1> <b> ATTENTION! THIS EMAIL COMES FROM" +
                "THIS MESSAGE COMES FROM THE SON OF THE KING OF NIGERIA!" +
                "</b> <h1>\n" +
                "<br>\n" +
                "<h4> I NEED 50K EUROS TO GET BACK TO MY THRONE <h4>\n" +
                "<br>\n" +
                "<h3> <b>PLEASE HELP ME WITH THE MONEY AND I SHALL FOREVER BE IN YOUR DEBT</b> <h3>";
        message.setContent(html, "text/html");

        return message;
    }
}
