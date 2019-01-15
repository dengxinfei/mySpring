package com.kelvin.myspring.pattern.prototype;

import javax.lang.model.type.PrimitiveType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 反射克隆方式
 *
 * @ClassName ReflectClone
 * @Author xinfei
 * @Date 2019/1/14 15:20
 **/
public class ReflectClone implements Cloneable{

    public int age = 30;

    //Date也实现了Cloneable接口
    public Date birthday = new Date();

    private String name = "Kelvin";

    public Target target = new Target();

    //ArrayList实现了Cloneable接口
    public List<String> nameList = new ArrayList<>();

    @Override
    public ReflectClone clone(){
        ReflectClone source = this;
        Class clazz = source.getClass();
        //(1)通过获取构造函数来构建对象
        try {
            //获取构造函数的定义，然后实例话对象
            Constructor cons = clazz.getConstructor();
            ReflectClone clone =  (ReflectClone)cons.newInstance();

            //直接实例化对象
            //ReflectClone clone = (ReflectClone) clazz.newInstance();
            Class clazzDes = clone.getClass();
            System.out.println(clone.name);

            //(2)获取对象的所有的属性
            Field[] fields = clazzDes.getDeclaredFields();
            Class fieldType = null;
            Object fieldVal = null;
            for(Field field: fields){
                field.setAccessible(true);
                fieldType = field.getType();
                fieldVal = field.get(this);

                //这些属性是对象中的引用类型，因此不能直接SET，否则就会把对象的引用传递过去
                //这些引用类型，同样可以使用克隆的方式进行克隆，并一次递归传递。
                if(fieldVal instanceof Cloneable){
                    Method cloneMethod = fieldVal.getClass().getDeclaredMethod("clone");
                    field.set(clone, cloneMethod.invoke(fieldVal, new Object[0]));
                }else{
                    field.set(clone, fieldVal);
                }
            }
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
