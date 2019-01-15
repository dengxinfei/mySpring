package com.kelvin.myspring.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ShadowClone
 * @Author xinfei
 * @Date 2019/1/11 15:43
 **/
public class ShadowClone implements Cloneable{

    public int height = 100;

    public int weigh = 100;

    public List<String> fetures = new ArrayList<>();

    public Target target = new Target();

    //浅拷贝
    //原型对象和拷贝对象是不同的地址
    //原型对象的属性值和拷贝对象的属性值是不同的地址空间
    //但是原型对象里面的引用对象的地址和拷贝对象相应的引用对象的地址空间是同一个地址空间
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
