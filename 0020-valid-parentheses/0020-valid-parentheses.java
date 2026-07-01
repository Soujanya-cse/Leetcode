class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> l=new LinkedList<>();

        for(char x:s.toCharArray()){
            if(x=='('||x=='{'||x=='['){
                l.addLast(x);
            }
            else if(l.size()!=0 && x==')' && l.peekLast()=='('){
                l.removeLast();
            }
             else if(l.size()!=0 && x=='}' && l.peekLast()=='{'){
                l.removeLast();
            }
             else if(l.size()!=0 && x==']' && l.peekLast()=='['){
                l.removeLast();
            }
            else{
                return false;
            }
        }

        if(l.size()!=0){
            return false;
        }
        return true;
    }
}