class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i=0;i<nums.length; i++){
            System.out.print(nums[i]);

            int p=1;
            for (int p_i=0; p_i<i; p_i++){
                p *= nums[p_i];                
            }

            int s=1;
            for (int s_i=nums.length-1; s_i>i; s_i--){
                s *= nums[s_i];
            }
            res[i]= p*s;
        }

        return res;
    }
}  