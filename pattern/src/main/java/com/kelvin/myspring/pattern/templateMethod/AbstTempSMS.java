package com.kelvin.myspring.pattern.templateMethod;

/**
 * @ClassName AbstraMethod
 * @Author xinfei
 * @Date 2019/1/23 14:23
 **/
public abstract class AbstTempSMS {

    //以短信发送为例，
    //（1）短信发送需要先获取账号
    //（2）获取账号后组装发送请求URL
    //（3）短信发送
    // (4) 钩子方法，决定是否需要记录日志
    //（5）记录日志功能

    //获取账号
    public abstract String getAccount();

    //获取发送的URL
    public abstract String getUrl();

    //发送短信
    public abstract String doSend(String account, String url);

    //记录日志
    public abstract void doLogger(String account, String url, String result);

    //钩子方法, 默认日志日志打印
    public boolean isLogger(){
        return true;
    }

    //模板方法
    public final void send(){
        //(1)获取账号
        String account = getAccount();

        //(2)获取发送的URL
        String url = getUrl();

        //(3)短信发送
        String result = doSend(account, url);

        //(4)判断是否记录日志。如果钩子重写，则根据子类实现判断，默认记录日志
        if(! isLogger()){
            return;
        }
        //记录日志
        doLogger(account, url, result);

    }

}
