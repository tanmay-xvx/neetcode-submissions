class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character,Integer> m = new HashMap<>();
        for(char c : s.toCharArray()){
            m.put(c, m.getOrDefault(c,0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!m.containsKey(c)) return false;
            int v = m.get(c) - 1;
            if(v==0){
              m.remove(c);  
            }else{
                m.put(c,v);
            }
        }

        return true;
    }
}
