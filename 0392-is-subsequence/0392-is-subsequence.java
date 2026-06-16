class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();

        if(s1.length==0){
            return true;
        }

        int j=0;

        for(int i:t1){
            if(i==s1[j]){
                j++;
            }
            if(j==s1.length){
                return true;
            }
        }

        return false;
    }
}