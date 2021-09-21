package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {

        MessageService messageService = new SkypeServiceMessage();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "");
    }

}
