class Solution {
    public int search(int[] nums, int target) {

        // classic binary search

        //initialize our left, right and mid
        int left = 0;
        int right = nums.length - 1;

        //while we are within bounds to continue
        while(left <= right){

            int mid = left + (right-left)/2;

            // if we're lucky and our target is mid, return it
            if(nums[mid] == target){
                return mid;
            }

            //otherwise if the left side of the array is sorted
            //if we enter this condition then we know this is sorted because its a rotated array 
            if(nums[left] <= nums[mid]) {
        
                // is our target number living in the left side
                if(target >= nums[left] && target < nums[mid]){
                    // if so, we move our right boundary to the left one 
                    // its almost like a shift, remember that right is the "end"
                    right = mid - 1;
                } else {
                    // otherwise we start looking on the right side
                    left = mid + 1;
                }

            // else if the left side is NOT sorted 
            // then the right MUST be sorted!
            } else {

                // Checking if the right side is sorted
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}

