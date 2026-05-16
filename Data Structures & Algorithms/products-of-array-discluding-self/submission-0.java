class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        int[] res = new int[n];

        prev[0] = 1;
        next[n-1] = 1;

        for(int i = 1; i < n ; i++){
            prev[i] = prev[i-1]*nums[i-1];
            next[n-i-1] = next[n-i]*nums[n-i];
        }

        for(int i = 0; i< n; i++){
            res[i] = prev[i] * next[i];
        }

        return res;
        
    }
}  
