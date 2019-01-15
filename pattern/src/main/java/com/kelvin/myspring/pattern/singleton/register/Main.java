package com.kelvin.myspring.pattern.singleton.register;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName Main
 * @Author xinfei
 * @Date 2019/1/10 18:29
 **/
public class Main {

    public static void main(String[] args) {

        int count = 2000;
        final CountDownLatch countDownLatch = new CountDownLatch(count);

        for(int i = 0; i < count; i++){
            new Thread("线程" + i){
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    RegisterSingleton object = RegisterSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + "已获取实例" + object);
                    //System.out.println(object);
                }
            }.start();
            countDownLatch.countDown();
        }



    }
}
