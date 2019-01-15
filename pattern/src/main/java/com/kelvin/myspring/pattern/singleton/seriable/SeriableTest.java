package com.kelvin.myspring.pattern.singleton.seriable;

import java.io.*;

/**
 * @ClassName SeriableTest
 * @Author xinfei
 * @Date 2019/1/9 18:18
 **/
public class SeriableTest {


    public static void main(String[] args) throws IOException {
        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("/Users/apple/Documents/Projects/Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            fis = new FileInputStream("/Users/apple/Documents/Projects/Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable)ois.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fis.close();
            fos.close();

        }



    }
}
