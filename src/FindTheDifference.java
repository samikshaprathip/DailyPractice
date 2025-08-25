public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int XOR = 0;
        for (int i = 0; i < s.length(); i++) {
            XOR ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            XOR ^= t.charAt(i);
        }
        return (char) XOR;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        FindTheDifference ftd = new FindTheDifference();
        char diff = ftd.findTheDifference(s, t);

        System.out.println("Find the Difference: " + diff);
    }
}

