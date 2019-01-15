package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName Main
 * @Author xinfei
 * @Date 2019/1/3 19:34
 **/
public class Main {

    public static void main(String[] args) {
        IFactory appleFactory = new AppleFactory();
        System.out.println(appleFactory.getIceCream());
        System.out.println(appleFactory.getDrink());

        IFactory oranageFactory = new OrangeFactory();
        System.out.println(oranageFactory.getIceCream());
        System.out.println(oranageFactory.getDrink());
    }
}
