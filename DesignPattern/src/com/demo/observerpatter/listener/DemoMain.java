package com.demo.observerpatter.listener;

public class DemoMain {
	
	public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("C:\\Test_workspaces\\resources\\log\\file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("go2albert@gmail.com"));

        try {
            editor.openFile("C:\\Test_workspaces\\resources\\Test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
