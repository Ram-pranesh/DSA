int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int* res = malloc(sizeof(int) * 2);
    res[0] = -1;
    res[1] = -1;
    *returnSize = 2;
    
    int low = 0, high = numsSize - 1, mid;
    while (low <= high) {
        mid = low + (high - low) / 2;
        if (nums[mid] < target) 
            low = mid + 1;
        else 
            high = mid - 1;
    }
    if (low >= numsSize || nums[low] != target)
        return res;
    
    res[0] = low;
    
    high = numsSize - 1;
    while (low <= high) {
        mid = low + (high - low) / 2;
        if (nums[mid] <= target)
            low = mid + 1;
        else 
            high = mid - 1;
    }
    res[1] = high;
    return res;
}