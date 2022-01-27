package com.gdm.unitbv.itsec.spoofing.app;

import com.gdm.unitbv.itsec.spoofing.factory.MailFactory;
import com.gdm.unitbv.itsec.spoofing.model.Credentials;
import com.gdm.unitbv.itsec.spoofing.model.EmailMessageType;
import com.gdm.unitbv.itsec.spoofing.util.EmailAddressValidator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.format("\nWelcome to my java app that can send mails to a yahoo or google address. Amazing amirite?\n\n" +
                "Please enter your email address:");

        String emailAddressSender = scanner.nextLine();
        while (!EmailAddressValidator.validateEmailAddress(emailAddressSender)) {
            System.out.println("Email address format not accepted! Please enter your email address correctly!");
            emailAddressSender = scanner.nextLine();
        }

        System.out.println("Please enter your password:");
        String emailAddressPassword = scanner.nextLine();
        while (emailAddressPassword.isEmpty()) {
            System.out.println("Enter your password again!");
            emailAddressPassword = scanner.nextLine();
        }

        System.out.println("Please enter the email address of the recipient");
        String emailAddressRecipient = scanner.nextLine();
        while (!EmailAddressValidator.validateEmailAddress(emailAddressRecipient)) {
            System.out.println("Email address format not accepted! Please enter your email address correctly!");
            emailAddressRecipient = scanner.nextLine();
        }

        System.out.println("You will see a list of email messages types. Please select one of them");
        System.out.println("1 - An email with an angry tone");
        System.out.println("2 - An email with a funny intent");
        System.out.println("3 - An email sent from an african king that needs money");
        int choice = 0;
        try{
            choice = scanner.nextInt();
            while(choice < 1 || choice > 3){
                System.out.println("Please enter a correct choice!");
                choice = scanner.nextInt();
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        Credentials credentials = new Credentials(
                emailAddressSender,
                emailAddressPassword,
                emailAddressRecipient
        );

        EmailMessageType emailMessageType = null;
        switch (choice){
            case 1:
                emailMessageType = EmailMessageType.ANGRY;
                break;
            case 2:
                emailMessageType = EmailMessageType.FUNNY;
                break;
            case 3:
                emailMessageType = EmailMessageType.NIGERIA;
                break;
        }
        
        MailFactory.sendMail(credentials, emailMessageType);
    }
}
