import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        if (s.length() % 2 == 1) {
            return false;
        }
        else {
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }
                else {
                    if (stack.empty()) {
                        return false;
                    }
                    else {
                        char lastAdded = (char)stack.peek();
                        if (c == ')' && lastAdded == '(') {
                            stack.pop();
                        }
                        else if (c == ']' && lastAdded == '[') {
                            stack.pop();
                        }
                        else if (c == '}' && lastAdded == '{' ) {
                            stack.pop();
                        }
                        else {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.empty();
    }
}