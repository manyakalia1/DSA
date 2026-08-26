class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("+")){
                int val2=st.pop();
                int val1=st.peek();
                int add=val1+val2;
                st.push(val2);
                st.push(add);
            }
            else if(ch.equals("D")){
                int val=st.peek();
                int doubleval=val*2;
                st.push(doubleval);
            }
            else if(ch.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
        
    }
}