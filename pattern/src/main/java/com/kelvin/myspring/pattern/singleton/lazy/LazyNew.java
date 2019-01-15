package com.kelvin.myspring.pattern.singleton.lazy;

/**
 * @ClassName Lazy2
 * @Author xinfei
 * @Date 2019/1/7 20:10
 *
 *
 * 饿汉模式：在类初始化的时候即将对象初始化，没有并发问题。但是比较占用空间。
 * 懒汉模式：在对象使用的时候初始化，为防止并发问题，需要加锁synchronized. 但是性能会有很大的限制。
 * 即要提升性能瓶颈，又要保证线程安全，怎么办？？？
 * 使用内部类的方式可以解决这一问题
 * 内部类：只有在调用内部类的方法或者属性的时候才会被初始化。
 *
 **/
public class LazyNew {


    private LazyNew(){

    }

    /**
     * 获取单例的实例
     *
     * static: 保证空间共享
     * final 保证方法不会被侵入(重写或者重载)
     *
     * @return
     */
    public static final LazyNew getInstance(){
        //在方法返回之前被初始化。
        //在多线程的环境下，只能有一个线程去初始化，其他线程只能阻塞等待
        //类的构造器，保证在多线程的环境下，能够正确的加锁。
        //这里有一个锁，指的是对象初始化的时候的锁。对象初始化完毕后即不需要锁，所以对性能影响有限。
        return LazyHolder.LAZY_NEW;
    }


    //内部类，只有在内部类的属性，或者方法被调用的时候加载
    //
    private static class LazyHolder{
        //final类型的属性，即使两个线程同时加载，也不会出现并发问题。
        private final static LazyNew LAZY_NEW = new LazyNew();
    }
}
