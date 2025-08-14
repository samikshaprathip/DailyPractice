public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // example array

        int sum = 0; // variable to store sum

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // add each element to sum
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
