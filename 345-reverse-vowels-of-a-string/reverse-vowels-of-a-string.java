class Solution {
    public String reverseVowels(String s) {
         char[] tmp = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !isVowel(tmp[left])) left++;
            while(left < right && !isVowel(tmp[right])) right--;
            if(left < right){
                char swap = tmp[left];
                tmp[left] = tmp[right];
                tmp[right] = swap;
                left++;
                right--;
            }
        }
        return new String(tmp);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}