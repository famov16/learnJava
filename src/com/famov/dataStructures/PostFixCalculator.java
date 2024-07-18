/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

import java.util.StringTokenizer;

/**
 *
 * @author Mozvil
 */
public class PostFixCalculator {

    private Stack stack;
    private boolean correct = true;

    public PostFixCalculator() {
        stack = new Stack(100);
    }

    private boolean isDigit(char ch) {
        return (ch >= '0') && (ch <= '9');
    }

    private boolean isNumber(String num) {
        int dot = -1;
        int ndig = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            if (c == '.') {
                if ((dot != -1) || (i >= num.length() - 1)) {
                    return false;
                }
                dot = i;
            } else if (c == '-') {
                if (i != 0) {
                    return false;
                }
            } else if (!isDigit(c)) {
                return false;
            } else {
                ndig++;
            }

        }

        return ndig > 0;
    }

    public boolean evaluate(String exp) {
        StringTokenizer st = new StringTokenizer(exp);
        int cur = 0;
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            cur++;
            if (isNumber(s)) {
                double d = Double.parseDouble(s);
                stack.push(d);
            } else if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {

                if (cur <= 2) {
                    System.out.println("Not enough numbers for operation: " + exp);
                    correct = false;
                    return false;
                }

                Object o2 = stack.pop();
                Object o1 = stack.pop();

                if (!(o2 instanceof Double) || !(o1 instanceof Double)) {
                    System.out.println("Operators are not numbers");
                    correct = false;
                    return false;
                }

                Double d1 = (Double) o1;
                Double d2 = (Double) o2;

                switch (s) {
                    case "+" ->
                        stack.push(d1 + d2);
                    case "-" ->
                        stack.push(d1 - d2);
                    case "*" ->
                        stack.push(d1 * d2);
                    case "/" ->
                        stack.push(d1 / d2);
                }
            } else {
                System.out.println("Invalid operator or operand: " + s);
                correct = false;
                return false;
            }
        }

        return true;
    }

    public void printResult() {
        if (correct) {
            System.out.println("Result : ");
            while (stack.getSize() > 0) {
                Object o = stack.pop();
                System.out.println(o);
            }

        }
    }

    public static void main(String[] args) {
        PostFixCalculator calc = new PostFixCalculator();
        calc.evaluate("5 6 + 9 +  2 / 5 * -1 * 2 * -1 *");
        calc.printResult();

    }
}
