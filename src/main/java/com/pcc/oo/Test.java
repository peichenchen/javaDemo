package com.pcc.oo;

import com.alibaba.fastjson.JSONObject;

/**
 * @author peichenchen
 * @date 2018/05/23
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(1L, "BMW");
        Parent parent = new Parent();
        parent.setCar(car);

        Sun sun1 = new Sun("sun1");
        Sun sun2 = new Sun("sun2");

        System.out.println(sun1.car);
        System.out.println(sun2.car);

        JSONObject valuerJson = JSONObject.parseObject("1000");
        System.out.println(valuerJson);
    }
}
