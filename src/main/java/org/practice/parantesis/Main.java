package valid.parantesis;

import java.util.Stack;

public class Main {
    static Boolean checkParenthesis(char ch1, char ch2) {
        return (ch1 == '(' && ch2 == ')') || (ch1 == '{' && ch2 == '}') || (ch1 == '[' && ch2 == ']');
    }

    static Boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        for (char c : charArray) {
            switch (c) {
                case '[', '(', '{':
                    stack.push(c);
                    break;
                case ')', ']', '}':
                    if ((stack.isEmpty()) || (!checkParenthesis(stack.pop(), c))) return false;
                    break;
                default:
                    continue;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "",              // Empty string (invalid)
                "()",            // Simple valid case
                "({[]})",        // Nested valid case
                "({[)]})",       // Nested invalid case
                "(",             // Single open bracket (invalid)
                ")",             // Single close bracket (invalid)
                "({[}])",        // Mixed brackets in wrong order (invalid)
                "{[()]}",        // Nested valid case
                "{[(])}",        // Nested invalid case
                "{[()]}[]{}",    // Multiple valid cases
                "[]{",           // Extra opening bracket (invalid)
                "[]}",           // Extra closing bracket (invalid)
                "a(b)c",         // Characters with valid brackets
                "a(b[c]{d}e)f",  // Characters with nested valid brackets
        };

        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> " + (isValidParentheses(testCase) ? "Valid" : "Invalid"));
        }
    }
}
