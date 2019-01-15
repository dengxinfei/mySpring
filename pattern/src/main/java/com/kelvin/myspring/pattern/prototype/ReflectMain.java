package com.kelvin.myspring.pattern.prototype;

/**
 * @ClassName ReflectMain
 * @Author xinfei
 * @Date 2019/1/14 16:01
 **/
public class ReflectMain {

    public static void main(String[] args) {
        ReflectClone reflectClone = new ReflectClone();

        ReflectClone clone = reflectClone.clone();
        //System.out.println(reflectClone);
        System.out.println(reflectClone.target == clone.target);

    }
}
