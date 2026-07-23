class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        //algorithm: to sort each element in the string 
        // DS: HashMap
        HashMap <String, List<String>> map = new HashMap<>();

        //initializing what we're returning
        List<List<String>> myList = new ArrayList <>();

        
        for(int i = 0; i<strs.length; i++) {
            char[] chars = strs[i].toCharArray();  // String -> char array
            Arrays.sort(chars);                    // sort it
            String sorted = new String(chars);     // sorted char element[i] -> back to String

            //now we have a sorted array of the strings, went from string -> char -> sort -> back to string 

            if(!(map.containsKey(sorted))){
                List<String> newList = new ArrayList <>();
                newList.add(strs[i]);
                map.put(sorted, newList);
            }else{
                map.get(sorted).add(strs[i]);
            }
        }
            for(List<String> group : map.values()) {
                myList.add(group);
            }
           return myList;

           
        


    }
}
