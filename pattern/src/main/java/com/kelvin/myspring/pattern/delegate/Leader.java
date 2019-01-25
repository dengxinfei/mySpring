package com.kelvin.myspring.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Leader
 * @Author xinfei
 * @Date 2019/1/23 18:31
 **/
public class Leader{

    private static Map<String, IEmployee> EMPLOYEES = new HashMap<>();

    static {
        EMPLOYEES.putIfAbsent("user", new UserEmployee());
        EMPLOYEES.putIfAbsent("order", new OrderEmployee());
    }


    public void work(String command) {
        IEmployee employee = EMPLOYEES.get(command);
        employee.work();
    }
}
