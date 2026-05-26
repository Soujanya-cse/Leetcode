class Solution {
    public int[] twoSum(int[] a, int target) {
        int mid;
        int i=0,j=a.length-1;
        int[] ans=new int[2];
        while(i<j){
            if(a[i]+a[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(a[i]+a[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
            return ans;
    }
}