package com.kelvin.myspring.pattern.proxy.custom;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName KelvinClassLoader
 * @Author xinfei
 * @Date 2019/1/16 16:54
 **/
public class KelvinClassLoader extends ClassLoader {

    private File classPathFile;

    public KelvinClassLoader(){
        //获取CLASS路径
        String classPath = KelvinClassLoader.class.getResource("/").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    public Class<?> findClass(String className){
        //(1) 基础校验 className的参数类型：【com.kelvin.myspring.pattern.proxy.custom.IHouseOwner, java.lang.Object】
        if(null == className){
            return null;
        }
        FileInputStream fis = null;
        ByteOutputStream bos = null;

        try{
            File classFile = new File(classPathFile, className.replaceAll("\\.", "/") + ".class");
            if(!classFile.exists()){
                return super.loadClass(className);
            }

            fis = new FileInputStream(classFile);
            bos = new ByteOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1){
                bos.write(buffer, 0 , len);
            }
            return defineClass(className, bos.toByteArray(), 0, bos.size());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(null != fis) {
                    fis.close();
                }
            }catch (Exception e1){
                e1.printStackTrace();
            }
            try{
                if(null != bos) {
                    bos.close();
                }

            }catch (Exception e1){
                e1.printStackTrace();
            }

        }
        return null;
    }

}
