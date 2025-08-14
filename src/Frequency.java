import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] arr = {10, 20, 30, 20, 40, 20, 50, 10};

        System.out.print("Enter the element to find frequency: ");
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + " = " + count);

        sc.close();
    }
}
