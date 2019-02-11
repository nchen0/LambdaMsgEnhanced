package com;

public interface MessageService
{
    void sendMessage(String msg, String receiveAddress);
    String readMessage();
}
