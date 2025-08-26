public class StringEquals {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        StringEquals sol = new StringEquals();

        String[] word1a = {"ab", "c"};
        String[] word2a = {"a", "bc"};
        System.out.println(sol.arrayStringsAreEqual(word1a, word2a));

        String[] word1b = {"a", "cb"};
        String[] word2b = {"ab", "c"};
        System.out.println(sol.arrayStringsAreEqual(word1b, word2b));

        String[] word1c = {"abc", "d", "defg"};
        String[] word2c = {"abcddefg"};
        System.out.println(sol.arrayStringsAreEqual(word1c, word2c));
    }
}

