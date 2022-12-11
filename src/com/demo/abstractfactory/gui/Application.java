package com.demo.abstractfactory.gui;
//This is a Client code for our use case.
public class Application {
    Button button;
    CheckBox checkBox;

// We injected GUIFactory to client code.
    public Application(GUIFactory factory){
        button = factory.creteButton();
        checkBox = factory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
