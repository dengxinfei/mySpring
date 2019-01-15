package com.kelvin.myspring.pattern.prototype;

import java.io.Serializable;

/**
 * @ClassName Target
 * @Author xinfei
 * @Date 2019/1/11 15:52
 **/
public class Target implements Serializable,Cloneable {


    public String name = "clone name";

    @Override
    public Target clone(){
        try {
            return (Target)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
