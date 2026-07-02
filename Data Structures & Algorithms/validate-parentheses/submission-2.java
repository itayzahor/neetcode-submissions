class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (c == ')' && stack.peek() == '(' ) {
                stack.pop();
                continue;
            }
            if (c == ']' && stack.peek() == '[' ) {
                stack.pop();
                continue;
            }
            if (c == '}' && stack.peek() == '{' ) {
                stack.pop();
                continue;
            }
            return false;
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
