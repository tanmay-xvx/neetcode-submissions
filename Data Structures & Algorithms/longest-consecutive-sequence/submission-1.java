class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int prev = nums[0];
        int maxCount = 1;
        int currCount = 1;
        for(int i = 1; i< nums.length ; i++){
            if(prev == nums[i])continue;
            if(nums[i] == prev + 1){
                currCount++;
            }else{
                currCount = 1;
            }
            prev = nums[i];
            maxCount = Math.max(maxCount,currCount);
            
        }
        return maxCount;
    }
}
