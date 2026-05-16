class Solution {

    public String encode(List<String> strs) {
        String delim = ":n:";
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(delim).append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        String delim = ":n:";
        List<String> res = new ArrayList<>();

        String[] parts = str.split(delim, -1);

        for (int i = 1; i < parts.length; i++) {
            res.add(parts[i]);
        }

        return res;
    }
}