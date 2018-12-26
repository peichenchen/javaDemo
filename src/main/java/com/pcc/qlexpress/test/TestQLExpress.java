package com.pcc.qlexpress.test;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * @author peichenchen
 * @date 2018/06/06
 */
public class TestQLExpress {
    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        String express2 = " if (conditionWave.equals(\"1.0 : 3.0\") && sampleSize >= 6 && handicap <= -5 "
                          + "&& ((predictMatch == 3 && matchProbability <=60) || predictMatch == 0)) return 'M0=600,H0=1000'";
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("conditionWave", "1.0 : 3.0");
        context.put("sampleSize", 8);
        context.put("handicap", -6);
        context.put("predictMatch", 0);
        context.put("matchProbability", 65);
        System.out.println(runner.execute(express2, context, null, false, true));



    }
}
