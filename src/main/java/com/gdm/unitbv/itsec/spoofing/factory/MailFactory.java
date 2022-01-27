package com.gdm.unitbv.itsec.spoofing.factory;

import com.gdm.unitbv.itsec.spoofing.model.Credentials;
import com.gdm.unitbv.itsec.spoofing.model.EmailMessageType;
import com.gdm.unitbv.itsec.spoofing.service.JavaMailService;

public class MailFactory {

    public static void sendMail(Credentials credentials, EmailMessageType emailMessageType) throws Exception {

        switch (emailMessageType){
            case ANGRY:
                JavaMailService.sendMail(credentials, EmailMessageType.ANGRY);
            case FUNNY:
                JavaMailService.sendMail(credentials, EmailMessageType.FUNNY);
            case NIGERIA:
                JavaMailService.sendMail(credentials, EmailMessageType.NIGERIA);
        }
    }
}
