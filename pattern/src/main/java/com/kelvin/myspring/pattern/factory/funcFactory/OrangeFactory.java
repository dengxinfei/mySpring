package com.kelvin.myspring.pattern.factory.funcFactory;

/**
 * @ClassName OrangeFactory
 * @Author xinfei
 * @Date 2019/1/4 18:22
 **/
public class OrangeFactory implements IFactory {

    @Override
    public IceCream getIceCream() {
        return new OrangeIceCream();
    }
}
