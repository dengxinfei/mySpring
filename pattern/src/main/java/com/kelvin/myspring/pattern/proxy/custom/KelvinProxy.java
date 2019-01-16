package com.kelvin.myspring.pattern.proxy.custom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName KelvinProxy
 * @Author xinfei
 * @Date 2019/1/16 16:54
 **/
public class KelvinProxy {

    private final static String ln = "\r\n";

    private static Method[] methods;

    /**
     * 自定义代理对象，动态生成目标的代理对象
     *
     * 1、动态生成.JAVA文件。
     * 2、将.JAVA 文件输出到磁盘上。
     * 3、编译.JAVA文件，生成.CLASS文件。
     * 4、加载CLASS文件到JVM中。
     * 5、实例化动态生成的对象，返回重组对象
     *
     *  @param classLoader
     * @param interfaces
     * @param handler
     * @return
     */
    public static Object newProxyInstance(KelvinClassLoader classLoader, Class<?>[] interfaces, IKelvinInvocation handler){
        //（1）动态生成Java文件
        methods = interfaces[0].getMethods(); //获取所有的方法
        String src = generateSrc(interfaces);

        //(2) 将JAVA文件保存到磁盘上
        String filePath = KelvinProxy.class.getResource("").getPath();
        File file = new File(filePath + "$KelvinProxy0.java");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String generateSrc(Class<?>[] interfaces){
        StringBuilder sb = new StringBuilder();
        //（1）构建包路径，构建引用的JAR包
        sb.append("package com.kelvin.myspring.pattern.proxy.custom;" + ln);
        sb.append("import " + interfaces[0].getName() + ";" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);

        //（2）构建类的结构
        sb.append("public class $KelvinProxy0 implements " + interfaces[0].getName() + "{" + ln);

        //（3）构建属性
        sb.append("private IKelvinInvocation h;" + ln);
        for(int i = 0; i < methods.length; i++){
            sb.append("private static Method m" + i + ";" + ln);
        }

        //(4) 构建静态代码块
        sb.append("static{ " + ln);
        sb.append("try{" + ln);
        for(int i = 0; i < methods.length; i++){
            sb.append("m" + i + " = Class.forName(\""  + interfaces[0].getName() + "\").getMethod(\"" + methods[i].getName() + "\");" + ln);

        }
        sb.append("}catch(NoSuchMethodException var2){" + ln);
        sb.append("throw new NoSuchMethodError(var2.getMessage());" + ln);
        sb.append("}catch (ClassNotFoundException var3){" + ln);
        sb.append("throw new NoClassDefFoundError(var3.getMessage());" + ln);
        sb.append("}" + ln);//try的结尾
        sb.append("}" + ln);//STATIC的结尾


        //(5) 构建构造函数
        sb.append("public $KelvinProxy0(IKelvinInvocation h){ " + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);

        //(6) 构造目标代理类的所有的实现接口
        for(int i = 0; i < methods.length; i++){
            Method method = methods[i];
            sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(");
            Parameter[] parameters = method.getParameters();
            if(null != parameters && parameters.length > 0){
                for(int k = 0; k < parameters.length; k ++){
                    if(k != 0) sb.append(",");
                    sb.append(parameters[i].getType() + " var" + k);
                }
            }
            sb.append("){" + ln);
            sb.append("try{");
            sb.append("this.h.invoke(this, m" + i + ", null);"  + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}" + ln);
        }
        sb.append("}");
        return sb.toString();
    }
}
