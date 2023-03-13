package com.driver;
public class Main {
    public static void main(String[] args) {

        RWOnly rw = new RWOnly();
//        rw.name = "jithin";
//        name has private access in RWOnly

        rw.setter("jithin");
        String name = rw.getter();

        System.out.println(name);
    }
}