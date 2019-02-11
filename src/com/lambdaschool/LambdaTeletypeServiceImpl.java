package com.lambdaschool;

import com.MessageService;

public class LambdaTeletypeServiceImpl implements MessageService
{
    @Override
    public void sendMessage(String msg, String address)
    {
        System.out.println(address + ":" + msg + ":" + address);
    }

    public String readMessage()
    {
        return "Not Implemented";
    }
}
