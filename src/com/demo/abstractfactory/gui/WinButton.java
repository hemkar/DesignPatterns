package com.demo.abstractfactory.gui;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button for windows");
    }
}
