import java.util.*;

public class DecodeXORedArray {
    // Solution method
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;       // original array size
        int[] arr = new int[n];           // store result
        arr[0] = first;                   // first element is given

        // decode rest using XOR property
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }

    // main method for testing
    public static void main(String[] args) {
        DecodeXORedArray solution = new DecodeXORedArray();

        // Example 1
        int[] encoded1 = {1, 2, 3};
        int first1 = 1;
        System.out.println("Decoded array 1: " + Arrays.toString(solution.decode(encoded1, first1)));

        // Example 2
        int[] encoded2 = {6, 2, 7, 3};
        int first2 = 4;
        System.out.println("Decoded array 2: " + Arrays.toString(solution.decode(encoded2, first2)));
    }
}

