public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";

        FirstUniqueChar fuc = new FirstUniqueChar();
        int idx = fuc.firstUniqChar(str);

        System.out.println("First Unique Character index: " + idx);
    }
}
