package com.demo.abstractfactory.gui;

public class Main {

    private static Application configureApplication(){
        //Application picks the factory type and creates it in run time (usually at initialization stage),
        // depending on the configuration or environment variables.
        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("windows")){
            return new Application(new WINFactory());
        }
        return new Application(new MacFactory());
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
