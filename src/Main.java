public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test case
        String num = "6777133339";
        String result = sol.largestGoodInteger(num);

        System.out.println("Largest good integer: " + result);
    }
}

class Solution {
    public String largestGoodInteger(String num) {
        String ans = ""; // stores the largest good integer found

        // Loop until the third last character
        for (int i = 0; i <= num.length() - 3; i++) {
            char c = num.charAt(i);

            // Check if the next two characters are the same as current
            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                String sub = num.substring(i, i + 3); // take the 3-digit substring

                // Update if ans is empty or sub is larger
                if (ans.isEmpty() || sub.compareTo(ans) > 0) {
                    ans = sub;
                }
            }
        }

        return ans; // return the largest found
    }
}
