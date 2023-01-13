package com.driver;

public class Main {

    public static void main(String[] args){

        RWOnly read = new RWOnly();

        read.getName();
        read.setName("private variable access changed");
        read.getName();

    }
}