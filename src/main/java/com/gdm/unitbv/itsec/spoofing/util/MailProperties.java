package com.gdm.unitbv.itsec.spoofing.util;

public class MailProperties {

    private static String smtpHost;
    private static String smtpPort;

    public static java.util.Properties getProperties(String mailProvider){

        java.util.Properties properties = new java.util.Properties();

//        properties.put("mail.debug", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");

        switch (mailProvider){
            case "yahoo":
                smtpHost = "smtp.mail.yahoo.com";
                smtpPort = "465";
                break;
            case "gmail":
                smtpHost = "smtp.gmail.com";
                smtpPort = "578";
                break;
        }

        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.socketFactory.port", smtpPort);

        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");

        return properties;
    }
}
