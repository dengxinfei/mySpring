//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.kelvin.myspring.pattern.proxy.custom;

import java.lang.reflect.Method;

public class $KelvinProxy0Demo implements IHouseOwner {
    private IKelvinInvocation h;
    private static Method m0;
    private static Method m1;

    public $KelvinProxy0Demo(IKelvinInvocation var1) {
        this.h = var1;
    }

    public void rentHouse(String var1, Integer var2) {
        try {
            this.h.invoke(this, m0, new Object[]{var1, var2});
        } catch (Throwable var3) {
            var3.printStackTrace();
        }

    }

    public void buyHouse() {
        try {
            this.h.invoke(this, m1, (Object[])null);
        } catch (Throwable var2) {
            var2.printStackTrace();
        }

    }

    static {
        try {
            m0 = Class.forName("com.kelvin.myspring.pattern.proxy.custom.IHouseOwner").getMethod("rentHouse", Class.forName("java.lang.String"));
            m1 = Class.forName("com.kelvin.myspring.pattern.proxy.custom.IHouseOwner").getMethod("buyHouse");
        } catch (NoSuchMethodException var1) {
            System.out.println("THIS IS ERROR PLACE");
            throw new NoSuchMethodError(var1.getMessage());
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
