class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> fm = new HashMap<>();

        Map<Integer, List<Integer>> cm =
            new TreeMap<Integer, List<Integer>>(Collections.reverseOrder());

        for (int num : nums) {
            fm.put(num, fm.getOrDefault(num, 0) + 1);
        }

        for (int key : fm.keySet()) {
            int freq = fm.get(key);

            List<Integer> temp =
                cm.getOrDefault(freq, new ArrayList<>());

            temp.add(key);
            cm.put(freq, temp);
        }

        List<Integer> res = new ArrayList<>();

        for (int freq : cm.keySet()) {
            List<Integer> temp = cm.get(freq);

            if (temp.size() > k) {
                for (int num : temp) {
                    if (k == 0) {
                        int[] ans = new int[res.size()];

                        for (int i = 0; i < res.size(); i++) {
                            ans[i] = res.get(i);
                        }

                        return ans;
                    }
                    res.add(num);
                    k--;


                }
            } else {
                k -= temp.size();
            }

            for (int num : temp) {
                res.add(num);
            }
        }

        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}