package com.lambdaschool;

public class LambdTextingServiceInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaTextingServiceImpl());
    }
}
