package com.kelvin.myspring.pattern.proxy.custom;
import com.kelvin.myspring.pattern.proxy.custom.IHouseOwner;
import java.lang.reflect.Method;
public class $KelvinProxy0 implements com.kelvin.myspring.pattern.proxy.custom.IHouseOwner{
    private IKelvinInvocation h;
    private static Method m0;
    private static Method m1;
    static{
        try{
            m0 = Class.forName("com.kelvin.myspring.pattern.proxy.custom.IHouseOwner").getMethod("buyHouse");
            m1 = Class.forName("com.kelvin.myspring.pattern.proxy.custom.IHouseOwner").getMethod("rentHouse");
        }catch(NoSuchMethodException var2){
            throw new NoSuchMethodError(var2.getMessage());
        }catch (ClassNotFoundException var3){
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
    public $KelvinProxy0(IKelvinInvocation h){
        this.h = h;
    }

    public void buyHouse(){
        try{this.h.invoke(this, m0, null);
        }catch(Throwable e){
            e.printStackTrace();
        }}
    public void rentHouse(String name){
        try{this.h.invoke(this, m1, null);
        }catch(Throwable e){
            e.printStackTrace();
        }}
}