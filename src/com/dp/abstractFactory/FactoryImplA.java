package com.dp.abstractFactory;

public class FactoryImplA implements AbstractFactory {
    @Override
    public AbstractPlugin getInstance() {
        return new PluginImplA();
    }
}
