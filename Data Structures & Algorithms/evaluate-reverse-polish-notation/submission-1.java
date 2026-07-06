class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        for (String str : tokens) { 
            if (str.equals("+")) {
                int x = s.pop();
                int y = s.pop();
                s.push(x+y);
            }
            else if (str.equals("-")) {
                int x = s.pop();
                int y = s.pop();
                s.push(y-x);
            }
            else if (str.equals("*")) {
                int x = s.pop();
                int y = s.pop();
                s.push(x*y);
            }
            else if (str.equals("/")) {
                int x = s.pop();
                int y = s.pop();
                s.push(y/x);
            }
            else {
                int num = Integer.parseInt(str);
                s.push(num);
            }
        }
        return s.peek();
    }
}
