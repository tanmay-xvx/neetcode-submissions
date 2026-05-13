class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            m.put(nums[i],i);
        }

        int[] res = new int[2];
        for(int i = 0; i< nums.length; i++){
            if(m.containsKey(target-nums[i])){
                int j = m.get(target-nums[i]);
                if( j != i){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
