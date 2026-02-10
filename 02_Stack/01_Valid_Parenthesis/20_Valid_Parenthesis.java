class Solution {
    public boolean isValid(String s) {
        Stack<Character> opened = new Stack<> ();

        char[] s_arr = s.toCharArray();
        for (char c : s_arr){
            System.out.print(c);

            if (c == ']'){
                if (!opened.empty() && opened.peek() == '['){
                    opened.pop();
                }
                else { return false;}
            }
            else if (c == '}'){
                if (!opened.empty() && opened.peek() == '{'){
                    opened.pop();
                }
                else { return false;}
            }
            else if (c == ')'){
                if (!opened.empty() && opened.peek() == '('){
                    opened.pop();
                }
                else { return false;}
            }
            else {
                opened.push(c);
            }
        }

        return opened.empty();
    }
}
