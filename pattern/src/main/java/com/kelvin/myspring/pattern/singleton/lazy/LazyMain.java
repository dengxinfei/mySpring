package com.kelvin.myspring.pattern.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LazyMain
 * @Author xinfei
 * @Date 2019/1/7 20:10
 **/
public class LazyMain {

    private static List<Integer> codeList = new ArrayList<Integer>();

    private static Long time = 0L;

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        //System.out.println(LazyNew.getInstance());
        //传统单例模式
        System.out.println(Lazy.getInstance());


        //优化单例模式
//        int count = 2000;
//        final CountDownLatch countDownLatch = new CountDownLatch(count);
//
//        for(int i = 0; i < count; i++){
//            new Thread("线程" + i){
//                @Override
//                public void run() {
//                    try {
//                        countDownLatch.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    LazyNew object = LazyNew.getInstance();
//                    System.out.println(Thread.currentThread().getName() + "已获取实例" + object);
//                    //System.out.println(object);
//                }
//            }.start();
//            countDownLatch.countDown();
//        }


    }
}
