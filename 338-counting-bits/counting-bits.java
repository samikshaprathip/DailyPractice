class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int sub = 1;
        for (int i = 1; i <= n; i++) {
            if (sub * 2 == i) {
                sub = i;
            }
            arr[i] = arr[i - sub] + 1;
        }
         return arr;        
    }
}