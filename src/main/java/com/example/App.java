package com.example;

/**
 * Hello world!
 *
 */
public class App{
    public static void main(String[] args){
        for (String msg: args) {
            String message = new App(msg).getMsg();
            System.out.println(message);
        }
    }

    private final String msg;

    public App(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
         return "Message: " + msg;
    }
}
