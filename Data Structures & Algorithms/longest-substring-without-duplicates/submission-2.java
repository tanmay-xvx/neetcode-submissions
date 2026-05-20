class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        int i = 0;
        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }else{
                while(set.contains(c)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(c);
            }
            res = Math.max(res,set.size());
        }
        return res;
    }
}
