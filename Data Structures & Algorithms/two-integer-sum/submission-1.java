class Solution {
    public int[] twoSum(int[] nums, int target) {
        

//The complement of the number would be what we need to add to 
// that number to get the target. 
// My thinking is iterate through nums, then store each number in a map
// and then we have the key, value pair. the key would be the number in the array 
// and the value would be its complement. 
// and everytime we iterate we check to see if the complement exists
// in our map.




HashMap <Integer, Integer> myMap = new HashMap <>();
// our pairing is (number from array, that numbers complement)


// we can pair up the number and the index 
// and then in complement we store the complement 

// so in the same array we have [3,0], complement 4; [4,1], [5,2], [6,3]
// so read 3 and then save its index and the complement is 4 

//so first in an if statement 

for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            // complement = 7-3 == 4 
            //if map containsKey(4) , 
            if (myMap.containsKey(complement)) {
                //return an int array with the the complement's index and the current index
                return new int[] { myMap.get(complement), i };
            }

            myMap.put(nums[i], i);
        }

        return new int[] {};

}




        
    }
