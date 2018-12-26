package com.pcc.qlexpress.test;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.Operator;

/**
 * @author peichenchen
 * @date 2018/12/22
 */
public class TestOperator {

    public static void main(String[] args) throws Exception {

        ExpressRunner runner = new ExpressRunner();
        runner.addOperatorWithAlias("如果", "if", null);
        runner.addOperatorWithAlias("则", "then", null);
        runner.addOperatorWithAlias("否则", "else", null);

        String exp = "如果  (语文+数学+英语>270) 则 {return 1;} 否则 {return 0;}";
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("语文", 90);
        context.put("数学", 90);
        context.put("英语", 89);

        Object result = runner.execute(exp, context, null, false, true, null);
        System.out.println(result);

        //(1)addOperator
        runner.addOperator("join", new JoinOperator());
        Object r = runner.execute("1 join 2 join 3", context, null, false, false);
        System.out.println(r);
        //返回结果  [1, 2, 3]

        //(2)replaceOperator
        runner.replaceOperator("+", new JoinOperator());
        Object r2 = runner.execute("1 + 2 + 3", context, null, false, false);
        System.out.println(r2);
        //返回结果  [1, 2, 3]

        //(3)addFunction
        runner.addFunction("joinFun", new JoinOperator());
        Object r3 = runner.execute("joinFun(1,4)", context, null, false, false);
        System.out.println(r3);

    }

    //定义一个继承自com.ql.util.express.Operator的操作符
    public static class JoinOperator extends Operator {
        @Override
        public Object executeInner(Object[] list) throws Exception {
            Object opdata1 = list[0];
            Object opdata2 = list[1];
            if (opdata1 instanceof java.util.List) {
                ((java.util.List) opdata1).add(opdata2);
                return opdata1;
            } else {
                java.util.List result = new java.util.ArrayList();
                result.add(opdata1);
                result.add(opdata2);
                return result;
            }
        }
    }
}
