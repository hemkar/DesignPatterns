package com.demo.abstractfactory.gui;

public class WINFactory extends GUIFactory {
    @Override
    public Button creteButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
