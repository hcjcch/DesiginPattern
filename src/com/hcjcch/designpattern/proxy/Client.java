package com.hcjcch.designpattern.proxy;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }

}