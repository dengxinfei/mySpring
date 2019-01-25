package com.kelvin.myspring.pattern.delegate;

/**
 * @ClassName Boss
 * @Author xinfei
 * @Date 2019/1/23 18:39
 **/
public class Boss {

    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.work("user");
    }
}
