class Solution {
    public int maxArea(int[] a) {
        int i=0;
        int j=a.length-1;
        int ans=0;
        int max=0;
       while(i<j){
            ans=(j-i)*Math.min(a[i],a[j]);
            if(ans>max){
                max=ans;
            }

            if(a[i]<a[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}