package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName OrangeFactory
 * @Author xinfei
 * @Date 2019/1/4 18:51
 **/
public class OrangeFactory implements IFactory {

    @Override
    public IceCream getIceCream() {
        return new OrangeIceCream();
    }

    @Override
    public IDrink getDrink() {
        return new OrangeDrink();
    }
}
