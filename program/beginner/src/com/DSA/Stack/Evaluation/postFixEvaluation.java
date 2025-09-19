package com.DSA.Stack.Evaluation;

import com.DSA.Stack.Evaluation.infixToPostFix;

public class postFixEvaluation {
    public static void main(String[] args) {
        infixToPostFix ob = new infixToPostFix("(6 + 2 * 3 / 2 - 5 * 6 + 2) * 5 - (8 / 4 * 3 - 3)");
        String s = ob.result;
        System.out.println(s);

    }
}
