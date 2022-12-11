package com.demo.abstractfactory.gui;

public class MacFactory extends GUIFactory {
    @Override
    public Button creteButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
