class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        // sliding window problem because we see "contiguous"
        // dynamic because we dont have a restricted size k for the window


        // general approach is to have a for loop & while loop

        // initialize what we're returning
        int min = 100000;
        int sum = 0;
        int left =0;
        

        // we keep sliding right, so when do we shrink our window?
        // our window shrinks when our sum is greater than or equal to target 
        // like we keep going but once we hit the tagrte we sjrink and if its less than we go back?
        for(int right = 0; right<nums.length; right++) {
            sum += nums[right];

            while(sum>= target) {
                min = Math.min(min, right-left+1);
                sum-=nums[left++];
            }
        }
        if(min == 100000) {
        return 0;
    } 
    return min;

    }
}