class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr=new int[nums.length];
        for(int i=0;i<index.length;i++){
            for(int j=index.length-1;j>index[i];j--){
                arr[j]=arr[j-1];
            }
            arr[index[i]]=nums[i];
        }
        return arr;
    }
}