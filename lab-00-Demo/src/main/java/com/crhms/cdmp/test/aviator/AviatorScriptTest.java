package com.crhms.cdmp.test.aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

/**
 * @author 王新刚
 * @date 2023/11/08 11:00
 */
public class AviatorScriptTest {
    public static void main(String[] args) {
        String expression = "let m = seq.map(\"soup:Envelope\", 1, \"b\", 2, \"c\", 3, 4, 5);\n" +
                "\n" +
                "println(seq.get(m, \"soup:Envelope\"));";
        Expression compiledExp = AviatorEvaluator.compile(expression);
        // Execute with injected variables.
        Boolean result =
                (Boolean) compiledExp.execute();
    }
}
