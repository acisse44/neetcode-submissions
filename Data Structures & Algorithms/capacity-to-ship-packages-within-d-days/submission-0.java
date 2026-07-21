class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        // with the binary search algorithm in mind

        // 1,2,3,4,5,6,7,8,9,10
        //10*(10+1)/2

        // THE GOAL IS TO FIND THE SMALLEST SHIP CAPACITY THAT WORKS!!!!

        // 10 will be our left boundary (min) (must be able to take heaviest
        // 55 will be our right boundary (max) (if we had one day) 

        // mid = (left + right) / 2
        // our mid = 55 + 10 = 65/2 = 32.5 ==> in int division its 32


        // initialize our right and left
        int leftMinBound=0;
        int rightMaxBound = 0;

        // actually set them!
        for(int weight: weights) {
            leftMinBound = Math.max(leftMinBound, weight);
            rightMaxBound+= weight;
        }

        // while the maximum weight 10 is less than our sum 
        // ismt this always true
        while( leftMinBound<rightMaxBound){
            //int mid = (leftMinBound + rightMaxBound) /2; both are the same
            // mid is literally just the candidate capacity 
            int mid = leftMinBound + (rightMaxBound - leftMinBound) / 2;

            // we have to think about what happens when the weights are more than mid 
            // if they are we have to put that weight (current) into the next day
            int daysNeeded = 1;
            int currentWeight = 0;

            // A working capacity is too large, so move left.
            // A failing capacity is too small, so move right.

            for(int weight: weights){
                if((currentWeight + weight) > mid) {
                    daysNeeded++;
                    currentWeight = weight;
                } else {
                    currentWeight+=weight;
                }
            }
        
            // now check did we meet the deadline and finish appropriately 
            if (daysNeeded <= days) {
                rightMaxBound = mid;
            } else {
                leftMinBound = mid + 1;
            }

        }
        return leftMinBound;



    }






}
