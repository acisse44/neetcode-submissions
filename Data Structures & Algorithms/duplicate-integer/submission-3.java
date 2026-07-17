class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1. We are dealing with an int array 
        // 2. checking if any duplicated exist! 
        // 3. uniqueness being the constaint 

        /* My initial idea is:
        Throw the array into a set and if the amount in the set is 
        less than the array then we know that dupllicates existed.

        array.size > mySet.size 

        More effienct approach:
        iterate through the array and add everything into the set while comparing 
        if it exists already!
    */

    Set <Integer> mySet = new HashSet<Integer>();

    //Iterate through the array and add everything to the set

        for(int i=0; i<nums.length; i++){
            if (mySet.contains(nums[i])){
                return true;
            } 
            mySet.add(nums[i]);
        }
        return false;
        

    }
}