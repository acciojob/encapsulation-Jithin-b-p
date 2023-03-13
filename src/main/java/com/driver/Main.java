package com.driver;
public class Main {
    public static void main(String[] args) {

        RWOnly rw = new RWOnly();
//        rw.name = "jithin";
//        name has private access in RWOnly

        rw.setName("jithin");
        String name = rw.getName();

        System.out.println(name);
    }
}