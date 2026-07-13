class Solution {
    public boolean isAnagram(String s, String t) {

//Initial solutions

/*
Sort then compare, if they arent the same size IMEDIATELY we know its False
array doesnt have sort method, maybe we can put it into an array list 
1. String type of data 
2. Asking if they contain the exactly same letters 

Hash Map also makes sense because we need to rememebr what we saw here. 

*/

// We know immediately if theyre not the same size, theyre not anagrams
if (s.length() != t.length()) return false;

//choosing Hash map because we want to rmm when we saw something
HashMap<Character, Integer> map = new HashMap<>();

//This method is intutive because instead of counting each and comparing,
// we can count one and then subtract from t if t has it.
// count s
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    //Now we're saying create an entry with put between c and either get 
    // the number of occurences or create from 0 and add 1 
    map.put(c, map.getOrDefault(c, 0) + 1);
}

// subtract t
for (int i = 0; i < t.length(); i++) {
    char c = t.charAt(i);

    if (!map.containsKey(c)) return false;

    map.put(c, map.get(c) - 1);

    //remove it so we only track whats left
    if (map.get(c) == 0) {
        map.remove(c);
    }
}

return map.isEmpty();

    }

}