class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (String token: tokens){
            if (token.equals("+")) {
                int l = s.peek();
                s.pop();
                int r = s.peek();
                s.pop();
                s.push(l+r);
            }
            else if (token.equals("-")) {
                int l = s.peek();
                s.pop();
                int r = s.peek();
                s.pop();
                s.push(r-l);              
            }
            else if (token.equals("*")) {
                int l = s.peek();
                s.pop();
                int r = s.peek();
                s.pop();
                s.push(r*l);              
            }
            else if (token.equals("/")) {
                int l = s.peek();
                s.pop();
                int r = s.peek();
                s.pop();
                s.push(r/l);              
            }
            else {
                s.push(Integer.parseInt(token));
            }
        }

        return s.peek(); 
    }
}
