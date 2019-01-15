package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName IAppleFactory
 * @Author xinfei
 * @Date 2019/1/4 18:46
 **/
public interface IFactory {

    IceCream getIceCream();

    IDrink getDrink();
}
