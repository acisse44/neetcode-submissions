class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();


        for(int i =0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // add all the opening brackets onto the stack
            if(c == '(' || c=='{' || c == '['){
                myStack.push(c);
            } else {

                if(myStack.isEmpty()) {
                    return false;
                }
                //save the instance of the top of the stack
                char top = myStack.pop();
                // if they are not a match, pop, invalid string
                if(c == ')' && top != '(') {
                    return false;
                }
                if(c == '}' && top != '{') {
                    return false;
                }
                if(c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
