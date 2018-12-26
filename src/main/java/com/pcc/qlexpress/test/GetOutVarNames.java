package com.pcc.qlexpress.test;

import com.ql.util.express.ExpressRunner;

/**
 * 编译脚本，查询外部需要定义的变量和函数。
 *
 * @author peichenchen
 * @date 2018/12/22
 */
public class GetOutVarNames {
    public static void main(String[] args) throws Exception {
        String express = "平均分 = (语文+数学+英语+综合考试.科目2)/4.0;return 平均分";
        ExpressRunner runner = new ExpressRunner(true, true);
        String[] names = runner.getOutVarNames(express);
        for (String s : names) {
            System.out.println("var : " + s);
        }
    }
}
