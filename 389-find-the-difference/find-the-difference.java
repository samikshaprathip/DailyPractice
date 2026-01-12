class Solution {
    public char findTheDifference(String s, String t) {
        int XOR = 0;
        for(char chr : s.toCharArray()){
            XOR ^= chr;
        }
         for(char chr : t.toCharArray()){
            XOR ^= chr;
        }
        return (char) XOR;
    }
}