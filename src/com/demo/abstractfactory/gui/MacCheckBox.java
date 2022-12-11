package com.demo.abstractfactory.gui;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Checkbox for Mac");
    }
}
