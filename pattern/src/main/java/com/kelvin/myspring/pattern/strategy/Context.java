package com.kelvin.myspring.pattern.strategy;

/**
 * @ClassName Context
 * @Author xinfei
 * @Date 2019/1/22 16:43
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void encrypt(){
        this.strategy.encrypt();
    }
}
