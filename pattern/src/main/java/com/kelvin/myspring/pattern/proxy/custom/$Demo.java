//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.kelvin.myspring.pattern.proxy.custom;

import java.lang.reflect.Method;

public class $Demo implements IHouseOwner {
    private IKelvinInvocation h;
    private static Method m0;
    private static Method m1;

    public $Demo(IKelvinInvocation var1) {
        this.h = var1;
    }

    public void buyHouse() {
        try {
            this.h.invoke(this, m0, (Object[])null);
        } catch (Throwable var2) {
            var2.printStackTrace();
        }

    }

    public void rentHouse(String var1, Integer var2, String var3) {
        try {
            this.h.invoke(this, m1, new Object[]{var1, var2, var3});
        } catch (Throwable var4) {
            var4.printStackTrace();
        }

    }

    static {
        try {
            m0 = Class.forName("com.kelvin.myspring.pattern.proxy.custom.IHouseOwner").getMethod("buyHouse");
            m1 = Class.forName("com.kelvin.myspring.pattern.proxy.custom.IHouseOwner").getMethod("rentHouse", Class.forName("java.lang.String"), Class.forName("java.lang.Integer"), Class.forName("java.lang.String"));
        } catch (NoSuchMethodException var1) {
            throw new NoSuchMethodError(var1.getMessage());
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
