package com.fristdaystudyidea.bean;

/**
 * @author shkstart
 * @create 2021-02-22-10:31 AM
 */
public class Message {

    private final String messageBody = "message body";

    public void write(){
        System.out.println("Write the " + messageBody);
    }

    public void send(){
        System.out.println("Send the " + messageBody);
    }

    public void receive(){
        System.out.println("Receive the " + messageBody );
    }
}
