class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> p = new Stack<Integer>();
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            if (p.isEmpty()) {
                p.push(i);
                continue;
            }
            int peek = temperatures[p.peek()];
            if (temperatures[i] <= peek) {
                p.push(i);
            }
            else {
                while (!p.isEmpty() && temperatures[i] > peek) {
                    int y = p.pop();
                    arr[y] = i - y; 
                    if(!p.isEmpty()){
                        peek = temperatures[p.peek()];
                    }
                }
                p.push(i);
            }
        }
        return arr;
    }
}
