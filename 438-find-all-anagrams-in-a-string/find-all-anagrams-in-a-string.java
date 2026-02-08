class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;
        int[] freqP = new int[26];
        int[] freqS = new int[26];
        for (char ch : p.toCharArray()) {
            freqP[ch - 'a']++;
        }
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            if (i >= k) {
                freqS[s.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(freqP, freqS)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}
