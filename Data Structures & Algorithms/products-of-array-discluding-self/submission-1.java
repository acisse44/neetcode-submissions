class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prodArray = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int product = 1;
            int current =0;
            while(current!= nums.length) {
                if(current!=i){
                    product*= nums[current];
                    prodArray[i] = product;
                }
             
                current++;
            }
        }
        return prodArray;
    }
}  
