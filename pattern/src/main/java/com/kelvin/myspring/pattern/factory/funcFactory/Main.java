package com.kelvin.myspring.pattern.factory.funcFactory;

/**
 * @ClassName Main
 * @Author xinfei
 * @Date 2019/1/3 18:29
 **/
public class Main {

    public static void main(String[] args) {
        IFactory factory = new AppleFactory();
        System.out.println(factory.getIceCream());
        factory = new OrangeFactory();
        System.out.println(factory.getIceCream());
    }
}
