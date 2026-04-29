class Solution {
    public String mergeAlternately(String a, String b) {
        String ans="";
        int sum=0;
        int i=0;

        for(i=0;i<=a.length()-1 && i<=b.length()-1;i++){
            if(sum==0){
                ans=ans+a.charAt(i);
                sum=1;
            }
            if(sum==1){
                ans=ans+b.charAt(i);
                sum=0;
            }
        }

        while(i<=a.length()-1){
            ans=ans+a.charAt(i);
            i++;
        }

        while(i<=b.length()-1){
            ans=ans+b.charAt(i);
            i++;
        }
    return ans;
    }
}