public class RansomNote {

    // Function to check if ransomNote can be constructed from magazine
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        // Count required letters from ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']++;
        }

        // Subtract available letters from magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']--;
        }

        // Check if any letters are still needed
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                return false; // some letter still required
            }
        }

        return true; // all requirements met
    }

    // Main function to test
    public static void main(String[] args) {
        // Test cases
        String ransomNote1 = "aa";
        String magazine1 = "aab";
        System.out.println("Can construct (aa, aab): " + canConstruct(ransomNote1, magazine1)); // true

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Can construct (aa, ab): " + canConstruct(ransomNote2, magazine2)); // false

        String ransomNote3 = "abc";
        String magazine3 = "cba";
        System.out.println("Can construct (abc, cba): " + canConstruct(ransomNote3, magazine3)); // true
    }
}
