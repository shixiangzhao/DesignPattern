package com.cienet.state;

public class Client {

    public static void main(String[] args){
        Context c = new Context(new ConcreteStateA());
        c.request();
    }
}
