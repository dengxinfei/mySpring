package com.kelvin.myspring.pattern.factory.simpleFactory;

/**
 * @ClassName SimpleMain
 * @Author xinfei
 * @Date 2019/1/2 17:25
 **/
public class SimpleMain {



    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();

        //不需要关系对象是如何创建的
        System.out.println(factory.getIceCream("apple"));



    }
}
