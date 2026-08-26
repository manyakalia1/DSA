class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        Stack<Character>sp=new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#'){
                if(!sp.isEmpty()){
                    sp.pop();
                }
            }
            else{
                sp.push(ch);
            }
        }
        return st.equals(sp);
        
    }
}