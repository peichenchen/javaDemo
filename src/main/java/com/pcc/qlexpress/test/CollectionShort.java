package com.pcc.qlexpress.test;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * 集合的快捷写法
 *
 * @author peichenchen
 * @date 2018/12/22
 */
public class CollectionShort {
    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner(false, false);
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "abc = NewMap(1:1,2:2); return abc.get(1) + abc.get(2);";
        Object r = runner.execute(express, context, null, false, false);
        System.out.println(r);
        express = "abc = NewList(1,2,3); return abc.get(1)+abc.get(2)";
        r = runner.execute(express, context, null, false, false);
        System.out.println(r);
        express = "abc = [1,2,3]; return abc[1]+abc[2];";
        r = runner.execute(express, context, null, false, false);
        System.out.println(r);
    }
}
