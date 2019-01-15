package com.kelvin.myspring.pattern.factory.funcFactory;

/**
 * @ClassName AppleFactory
 * @Author xinfei
 * @Date 2019/1/4 18:22
 **/
public class AppleFactory implements IFactory {

    @Override
    public IceCream getIceCream() {
        return new AppleIceCream();
    }
}
