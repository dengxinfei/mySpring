package com.kelvin.myspring.pattern.templateMethod;

/**
 * @ClassName YTSMS
 * @Author xinfei
 * @Date 2019/1/23 14:38
 **/
public class YTSMS extends AbstTempSMS {

    @Override
    public String getAccount() {
        System.out.println("移通：进入获取账号功能。");
        return "账号：123， 密码：345";
    }

    @Override
    public String getUrl() {
        System.out.println("移通：进入获取发送URL功能。");
        return "http://xxxx.com";
    }

    @Override
    public String doSend(String account, String url) {
        System.out.println("移通：开发发送短信。account=" + account + ", url=" + url);
        return "玄武成功";
    }

    @Override
    public void doLogger(String account, String url, String result) {
        System.out.println("移通：开始记录日志。account=" + account + ", url=" + url + ",result=" + result);
    }
}
