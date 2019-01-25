package com.kelvin.myspring.pattern.delegate;

/**
 * @ClassName JavaEmployee
 * @Author xinfei
 * @Date 2019/1/23 18:30
 **/
public class UserEmployee implements IEmployee {

    @Override
    public void work() {
        System.out.println("开始会员模块的编写工作");
    }
}
