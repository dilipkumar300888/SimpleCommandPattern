package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        System.out.println(lightOnCommand);
    }
}