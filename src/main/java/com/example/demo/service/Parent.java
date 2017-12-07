package com.example.demo.service;

/**
 * @author xlg
 * @since 2017/12/5
 */
public class Parent {
    public void work() {
        work1();
    }
    public void work1(){
        System.out.println("parent work1");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.work();
    }
}
