class Solution {
    public int searchInsert(int[] nums, int target) {
        // binary search problem

        int left =0; 
        int right = nums.length-1;

        while(left <= right) {
            int mid = left + (right-left) / 2;


            if(nums[mid] == target) {
                return mid;
            } 

            if(target < nums[mid]) {
                right = mid-1;
            } else {
                left = mid +1;
            }

        }
        //left is not only where the target gets inserted — 
        // it is also the first position where the target could start being valid.
        return left;
    }
}