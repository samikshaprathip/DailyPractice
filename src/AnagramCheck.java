import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        // If lengths are different, cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Convert strings to char array
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sort arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare sorted arrays
        if (Arrays.equals(a, b)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }

        sc.close();
    }
}
