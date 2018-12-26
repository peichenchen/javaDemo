package com.pcc.qlexpress.test;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * @author peichenchen
 * @date 2018/12/22
 */
public class TestAddFunctionOfClassMethod {

    public static void main(String[] args) throws Exception {

        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();

        runner.addFunctionOfClassMethod("取绝对值", Math.class.getName(), "abs", new String[] { "double" }, null);
        runner.addFunctionOfClassMethod("转换为大写", BeanExample.class.getName(), "upper", new String[] { "String" }, null);

        runner.addFunctionOfServiceMethod("打印", System.out, "println", new String[] { "String" }, null);
        runner.addFunctionOfServiceMethod("contains", new BeanExample(), "anyContains",
            new Class[] { String.class, String.class }, null);

        String exp = "取绝对值(-100);转换为大写(\"hello world\");打印(\"你好吗？\");contains(\"helloworld\",\"aeiou\")";
        runner.execute(exp, context, null, false, false);
    }

}
