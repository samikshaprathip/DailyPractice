int numIdenticalPairs(int* nums, int numsSize) {
    int count[101]={0};
    int result=0;
    for(int i =0;i<numsSize;i++){
        result+=count[nums[i]];
        count[nums[i]]++;

    }
    return result;
}