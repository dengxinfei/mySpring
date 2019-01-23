package com.kelvin.myspring.pattern.templateMethod;

/**
 * @ClassName TemplateTest
 * @Author xinfei
 * @Date 2019/1/23 15:09
 **/
public class TemplateTest {

    public static void main(String[] args) {
        AbstTempSMS xw = new XWSMS();
        xw.send();
        AbstTempSMS yt = new YTSMS();
        yt.send();
    }
}
