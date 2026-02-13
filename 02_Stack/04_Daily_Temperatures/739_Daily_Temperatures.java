class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();

        for (int i=0; i < temperatures.length; i++){
            while(!s.empty() && temperatures[i] > temperatures[s.peek()]){
                int old_day = s.peek();
                s.pop();
                res[old_day] = i - old_day;
            }
            s.push(i);
        }

        return res;
    }
}
