package com.kelvin.myspring.pattern.delegate;

/**
 * @ClassName CEmployee
 * @Author xinfei
 * @Date 2019/1/23 18:29
 **/
public class OrderEmployee implements IEmployee {

    @Override
    public void work() {
        System.out.println("开始订单模块的编程工作。");
    }
}
