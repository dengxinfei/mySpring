package com.kelvin.myspring.pattern.singleton.lazy;

/**
 * Created by Tom on 2018/3/7.
 */
public class Lazy {

    private Lazy(){}

    private static Lazy lazy = null;

    public static synchronized Lazy getInstance(){

        if(lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
