class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
    //fixed sliding window problem 

    Deque <Integer> deque = new ArrayDeque<>();

    int[] results = new int[nums.length-k+1];
    //monotonically decreasing order
    //Front(oldest).     Back(newest)
    // we push through the back 
     //——————>>>>> this way 

    //setting initial window 
    //will actually stop at k-1
    for(int i=0; i<k; i++) {
        while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
            deque.removeLast();
        }
         deque.addLast(i);
    }

    results[0]= nums[deque.peekFirst()];

// now we want to slide and see the other windows and values 

    int resultIndex =1;
    for(int right=k; right<nums.length; right++) {

        // remove the left most because we are sliding 
        if(!deque.isEmpty() && deque.peekFirst() < right-k+1){
            deque.removeFirst();
        }

        // and now we want to know where the element we are adding belong in the deque
        //while the deque is empty and the current number is greater than the last number in the deque (knowing its in decreasing order)
        while(!deque.isEmpty() && nums[right] > nums[deque.peekLast()]) {
            deque.removeLast();
        }
        //otherwise add the number to the deque (from the back)
        deque.addLast(right);
        
        // We want to continue adding into our results array
        // we are adding the maximum each time
        results[resultIndex] = nums[deque.peekFirst()];
        resultIndex++;

    }

        return results;

    }
}

