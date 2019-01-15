package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName AppFactory
 * @Author xinfei
 * @Date 2019/1/4 18:50
 **/
public class AppleFactory implements IFactory {

    @Override
    public IceCream getIceCream() {
        return new AppleIceCream();
    }

    @Override
    public IDrink getDrink() {
        return new AppleDrink();
    }
}
