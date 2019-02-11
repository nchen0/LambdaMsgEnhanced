package com.lambdaschool;

public class Main
{

    public static void main(String[] args)
    {
        String myMsg = "Come Here--I want to see you.";
        String myAddress  = "Mr. Watson";
        String myText = "Watson";

        MessageServiceInjector injector;
        Processor app;

        injector = new LambdaMessageInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myAddress);

        System.out.println("\n\n");

        injector = new LambdTextingServiceInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myText);

        System.out.println("\n\n");

        injector = new LambaTeletypeServiceInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myAddress);

    }
}
