class Solution {
    public int maxOperations(int[] a, int k) {
        int i=0;
        int j=a.length-1;
        int ans=0;

        Arrays.sort(a);

        while(i<j){
            if(a[i]+a[j]==k){
                ans=ans+1;
                i++;
                j--;
            }
            else if(a[i]+a[j]<k){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}