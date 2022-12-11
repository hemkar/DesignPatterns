package com.demo.abstractfactory.gui;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button for Mac");
    }
}
