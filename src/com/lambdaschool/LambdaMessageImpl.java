package com.lambdaschool;

import com.MessageService;

public class LambdaMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String msg, String receiveAddress)
    {
        System.out.println("For " + receiveAddress + ": " + msg);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
