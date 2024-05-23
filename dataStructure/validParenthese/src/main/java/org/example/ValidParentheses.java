package org.example;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] characterArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char cur : characterArray) {
            if (!stack.isEmpty()) {
                char preview = stack.peek();
                if (isPair(preview, cur)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(cur);
        }
        return stack.isEmpty();
    }

    public boolean isPair(char preview, char current) {
        return (preview == '(' && current == ')') ||
                (preview == '[' && current == ']') ||
                (preview == '{' && current == '}');
    }
}