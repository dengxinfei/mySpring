package com.kelvin.myspring.pattern.proxy.dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName DynamicTest
 * @Author xinfei
 * @Date 2019/1/15 16:57
 **/
public class DynamicTest {

    public static void main(String[] args) throws IOException {
        IHouseOwner houseOwner = new HouseOwner();
        IHouseOwner proxy = (IHouseOwner)HouseProxy.getInstance(houseOwner);
        proxy.buyHouse();
        System.out.println(proxy.getClass());

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IHouseOwner.class});
        FileOutputStream fos = new FileOutputStream("/Users/apple/Documents/temp/$Proxy0.class");
        fos.write(bytes);
        fos.close();

    }

}
