package com.famov.dataStructures;

import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mozvil
 */
public class InFixToPostFix {
    private boolean isDigit(char ch) {
        return (ch >= '0') && (ch <= '9');
    }
    
    private boolean isNumber(String str) {
        int dot = -1;
        int nDigits = 0;
        for (int n=0; n<str.length(); n++) {
            char ch = str.charAt(n);
            if (ch == '.') {
                if ((dot != -1) || (n >= (str.length() - 1)))
                    return false;
                dot = n;
            } else if (ch == '-') {
                if (n != 0)
                    return false;
            } else if (!isDigit(ch))
                return false;
            else
                nDigits++;
        }
        return nDigits > 0;
    }
    
    private boolean isOperator(String s) {
        return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
    }
    
    private int operatorPrecedence(String s) {
        if ("+".equals(s) || "-".equals(s))
            return 1;
        else if ("*".equals(s) || "/".equals(s))
            return 2;
        return 0;
    }
    
    private void spaceAppend(StringBuilder sb, String s) {
        if (sb.length() > 0)
            sb.append(" ");
        sb.append(s);
    }
    
    public String toPostFix(String expr) {
        StringBuilder res = new StringBuilder();
        Stack<String> stack = new Stack<>(100);
        
        StringTokens st = new StringTokens(expr);
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if ("(".equals(s)) {
                stack.push(s);
            } else if (isNumber(s)) {
                spaceAppend(res, s);
            } else if (isOperator(s)) {
                if (stack.getSize() > 0) {
                    String peek = stack.peek();
                    while ((stack.getSize() > 0) && isOperator(peek) && 
                           (operatorPrecedence(peek) >= operatorPrecedence(s)) && !"(".equals(peek)
                          ) {
                        spaceAppend(res, peek);
                        peek = stack.pop();
                    }
                }
                stack.push(s);
            } else if (")".equals(s)) {
                while ((stack.getSize() > 0) && !"(".equals(stack.peek())) {
                    spaceAppend(res, stack.pop());
                }
                stack.pop(); // pop '('
            }
        }
        while (stack.getSize() > 0) {
            String s = stack.pop();
            spaceAppend(res, s);
        }
        
        return res.toString();
    }
    
    public static void main(String[] args) {
        InFixToPostFix cvt = new InFixToPostFix();
        String result = cvt.toPostFix("( 1 + 2 * ( 5 + 6 ) ) * ( 3 + 4 )");
        System.out.println(result);
        
        PostFixCalculator calc = new PostFixCalculator();
        if (calc.evaluate(result)) {
            calc.printResult();
        }
    }
}
