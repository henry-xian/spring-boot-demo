package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xlg
 * @since 2017/12/5
 */
public class Child extends Parent {

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void work1(){
        System.out.printf("child work1");
    }
}
