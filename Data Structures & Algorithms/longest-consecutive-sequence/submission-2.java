class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int maxCount = 0;

        for (int num : set) {

            // start of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
