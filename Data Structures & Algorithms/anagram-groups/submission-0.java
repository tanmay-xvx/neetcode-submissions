class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String ns = new String(ca);

            if (m.containsKey(ns)) {
                m.get(ns).add(s);
            } else {
                m.put(ns, new ArrayList<String>(Arrays.asList(s)));
            }
        }

        List<List<String>> res = new ArrayList<>();

        for (String key : m.keySet()) {
            res.add(m.get(key));
        }

        return res;
    }
}