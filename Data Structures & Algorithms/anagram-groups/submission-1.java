class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String ns = new String(ca);
            m.putIfAbsent(ns, new ArrayList<>());
            m.get(ns).add(s);
        }

        return new ArrayList<>(m.values());
    }
}