package com.kelvin.myspring.pattern.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DeepClone
 * @Author xinfei
 * @Date 2019/1/11 16:19
 **/
public class DeepClone implements Cloneable, Serializable {

    public int lengh = 10;

    public Target target = new Target();


    public List<String> strList = new ArrayList<>();

    @Override
    public DeepClone clone(){
        return serializerCopy();
    }

    public DeepClone serializerCopy(){
        ObjectOutputStream oos = null;
        ByteOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepClone deepClone = null;
        try {
            bos = new ByteOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepClone = (DeepClone)ois.readObject();
            return deepClone;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != oos) {
                    oos.close();
                }
                bos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
