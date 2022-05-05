package com.devdutt.stack;

import java.util.Stack;

public class Parentheses_Matching_Problem {

    private static boolean isParenthesesMatching(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (isOpening(chr)) {
                stack.push(chr);
            }//if
            else {
                if (stack.isEmpty()) {
                    return false;
                }//if
                else if (!isMatching(stack.peek(), chr)) {
                    return false;
                }//else if
                else {
                    stack.pop();
                }//inner-else
            }//outer-else
        }//for
        return stack.isEmpty();
    }//method

    private static boolean isOpening(char ch) {

        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public static void main(String[] args) {
        String str1 = "[{(())}]";
        System.out.println("Input-01 :- " + str1);
        boolean result1 = isParenthesesMatching(str1);
        System.out.println("Result:- " + result1);
        System.out.println("====================================");

        String str2 = "[()]]";
        System.out.println("Input-02 :- " + str2);
        boolean result2 = isParenthesesMatching(str2);
        System.out.println("Result:- " + result2);

        System.out.println("====================================");
        String str3 = "([{}])";
        System.out.println("Input-03 :- " + str3);
        boolean result3 = isParenthesesMatching(str3);
        System.out.println("Result:- " + result3);

        System.out.println("====================================");
        String str4 = "{((()))]";
        System.out.println("Input-04 :- " + str4);
        boolean result4 = isParenthesesMatching(str4);
        System.out.println("Result:- " + result4);

    }


}
