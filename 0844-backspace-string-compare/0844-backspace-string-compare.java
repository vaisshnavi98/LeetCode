class Solution {
    private void perform(String s,Stack<Character> s1) {
       
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!='#') {
                s1.push(s.charAt(i));
            }else{
                if(!s1.isEmpty())s1.pop();
            }
        }

    }

    public boolean backspaceCompare(String s, String t) {
         Stack<Character> s1 = new Stack<>();
         Stack<Character> s2 = new Stack<>();

         perform(s,s1);
         perform(t,s2);

         return s1.equals(s2);

        
    }
}