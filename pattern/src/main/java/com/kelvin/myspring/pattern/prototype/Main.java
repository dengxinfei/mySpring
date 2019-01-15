package com.kelvin.myspring.pattern.prototype;

/**
 * @ClassName Main
 * @Author xinfei
 * @Date 2019/1/11 15:48
 **/
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
//        ShadowClone shadowClone = new ShadowClone();
//        shadowClone.fetures.add("筋斗云");
//        System.out.println(shadowClone);
//        shadowClone.height = 200;
//        ShadowClone clone = (ShadowClone)shadowClone.clone();
//        System.out.println(clone.fetures.get(0));
//        System.out.println(shadowClone.fetures == clone.fetures);
//
//        System.out.println(clone.height);
//        System.out.println(shadowClone.target == clone.target);

        //深拷贝DEMO
        DeepClone deepClone = new DeepClone();
        DeepClone dcCopy = deepClone.clone();
        System.out.println(deepClone == dcCopy);
        System.out.println(deepClone.target == dcCopy.target);
        Target target = new Target();
        target = deepClone.target;
        dcCopy.target = target;
        System.out.println(deepClone.target == dcCopy.target);
    }
}
