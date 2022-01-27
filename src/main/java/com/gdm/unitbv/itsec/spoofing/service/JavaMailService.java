package com.gdm.unitbv.itsec.spoofing.service;

import com.gdm.unitbv.itsec.spoofing.message.MailMessage;
import com.gdm.unitbv.itsec.spoofing.model.Credentials;
import com.gdm.unitbv.itsec.spoofing.model.EmailMessageType;
import com.gdm.unitbv.itsec.spoofing.util.MailProperties;

import javax.mail.*;
import java.util.Properties;

public class JavaMailService {

    public static void sendMail(Credentials credentials, EmailMessageType emailMessageType) throws Exception {

        System.out.println("Preparing to send email");

        Properties properties = MailProperties.getProperties("yahoo");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        credentials.getEmailAddressSender(),
                        credentials.getEmailAddressSenderPassword());
            }
        });

        Message message = null;
        switch (emailMessageType){
            case ANGRY:
                message = MailMessage.getAngryMessage(session, credentials);
                break;
            case FUNNY:
                message = MailMessage.getFunnyMessage(session, credentials);
                break;
            case NIGERIA:
                message = MailMessage.getNigeriaMessage(session, credentials);
                break;
            default:
                message = MailMessage.getRandomMessage(session, credentials);
                break;
        }

        try {
            Transport.send(message);
            System.out.println("Mail sent successfully");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
