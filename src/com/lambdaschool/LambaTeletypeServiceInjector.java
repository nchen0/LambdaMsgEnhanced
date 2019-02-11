package com.lambdaschool;

public class LambaTeletypeServiceInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaTeletypeServiceImpl());
    }
}
