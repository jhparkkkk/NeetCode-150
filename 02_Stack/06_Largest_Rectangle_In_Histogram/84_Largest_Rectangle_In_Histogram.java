class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> s = new Stack<>();

        int max_area = 0;

        for (int i = 0; i < heights.length; i++ ){
            int start = i;

            while (!s.isEmpty() && s.peek()[1] > heights[i]){
                int[] top = s.pop();
                int index = top[0];
                int height = top[1];

                max_area = Math.max(max_area, height * (i - index));
                start = index;
            }

            s.add(new int[] {start, heights[i]});
        }

        while (!s.isEmpty()){
            int[] top = s.pop();
            int index = top[0];
            int height = top[1];

            max_area = Math.max(max_area, height * (heights.length - index));
        }

        return max_area;
    }
}
