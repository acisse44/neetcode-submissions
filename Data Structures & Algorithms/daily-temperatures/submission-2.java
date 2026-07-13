class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       // temperatures[i] represents the daily temp on the ith day
       // results[i] is the number of days after the ith day before a warmer temp appears 


                // index   0  1  2  3  4  5  6
        // temperatures = [30,38,30,36,35,40,28]
                   //days  1   2  3  4  5  6  7

    // brute force would be have a double for loop where we are comparing
    //O(n^2) time complexity 
     int [] results = new int [temperatures.length];

    // for(int i =0; i<temperatures.length; i++) {
    //     for(int j = i+1; j<temperatures.length; j++) {
    //         if(temperatures[i] < temperatures[j]) {
    //             results[i] = j-i;
    //             break;
    //         }
    //     }
    // }

    // return results;


    // efficient approach

   Stack<Integer> stack = new Stack<>();

   int n = temperatures.length-1;

   for(int i =n; i>=0; i--) {
    while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
        stack.pop();
    }
    if(!stack.isEmpty()) {
        results[i] = stack.peek()-i;
    }
    stack.push(i);
   }
   return results;
    

    }
}
