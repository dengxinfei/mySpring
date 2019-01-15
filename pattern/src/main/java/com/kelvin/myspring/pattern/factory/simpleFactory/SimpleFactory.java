package com.kelvin.myspring.pattern.factory.simpleFactory;

/**
 * @ClassName SimpleFactory
 * @Author xinfei
 * @Date 2019/1/2 17:34
 **/
public class SimpleFactory {


    public IceCream getIceCream(String name){
        if("apple".equals(name)){
            return new AppleIceCream();
        }else if("orange".equals(name)){
            return new OrangeIceCream();
        }else {
            return null;
        }
    }

}
