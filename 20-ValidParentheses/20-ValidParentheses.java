// Last updated: 7/9/2026, 3:10:40 PM
//second method 
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                st.push(c);
            }else {
                if(st.isEmpty()) return false;
            else if(c==')' && st.peek()=='(') st.pop();
            else if(c==']' && st.peek()=='[') st.pop();
            else if(c=='}' && st.peek()=='{') st.pop();
                else return false;}
        }
        return st.isEmpty();
    }
}