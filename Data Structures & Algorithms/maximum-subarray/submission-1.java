class Solution {
    public int maxSubArray(int[] nums) {
        
        //Kadane's Algorithm problem

        // at every point we ask, do we want to continue with the prev. elements
        // or drop them as they are hurting us (harmful load)

        int prevSum =0;
        int max =nums[0] ;

        for(int i =0; i<nums.length; i++) {
        
        int currentNum = nums[i];

            if((prevSum + currentNum) < currentNum) {
                prevSum = currentNum;
            }else{
                prevSum += currentNum;
            }

            max = Math.max(max, prevSum);
        }
        
            return max;

    }
     
}
