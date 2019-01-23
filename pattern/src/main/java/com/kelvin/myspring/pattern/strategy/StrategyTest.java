package com.kelvin.myspring.pattern.strategy;

/**
 * @ClassName StrategyTest
 * @Author xinfei
 * @Date 2019/1/22 16:45
 **/
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context(new MD5Strategy());
        context.encrypt();
    }
}
