package com.demo.abstractfactory.gui;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("checkBox for Windows");
    }
}
