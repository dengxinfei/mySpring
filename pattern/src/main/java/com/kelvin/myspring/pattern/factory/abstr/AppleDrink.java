package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName AppleDrink
 * @Author xinfei
 * @Date 2019/1/4 18:41
 **/
public class AppleDrink implements IDrink {

    @Override
    public void drink() {
        System.out.println("我是苹果味的饮料");
    }
}
