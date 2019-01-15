package com.kelvin.myspring.pattern.proxy.statics;

/**
 * @ClassName HouseProxy
 * @Author xinfei
 * @Date 2019/1/15 16:20
 **/
public class HouseProxy implements IHouseOwner {

    //目标类的对象
    private IHouseOwner houseOwner;

    //代理类，代理类和目标类都要实现相同的接口，因为代理要代理目标所有的功能。
    //优点：代理类可以实现对目标实现功能的扩展，不需要修改目标对象。在某种程度上符合开闭原则。
    //缺点：如果目标类的功能发生增加，或者加少，就需要同步增加或者删除代理类。
    //缺点：一种类型的被代理的类，需要有一个相应的代理类

    public HouseProxy(IHouseOwner houseOwner ){
        this.houseOwner = houseOwner;
    }


    @Override
    public void buyHouse() {
        System.out.println("我是中介：开始帮你买房");
        houseOwner.buyHouse();
        System.out.println("我是中介：我们准备签订买房合同");

    }

    @Override
    public void rentHouse() {
        System.out.println("我是中介：开始帮你租房");
        houseOwner.rentHouse();
        System.out.println("我是中介：我们准备签订租房合同");
    }
}
