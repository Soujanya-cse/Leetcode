class Solution {
    public int[] productExceptSelf(int[] n) {
        int[] prefix = new int[n.length];
        int[] suffix = new int[n.length];
        int[] ans = new int[n.length];

        prefix[0]=n[0];
        for(int i=1;i<=n.length-1;i++){
            prefix[i]=prefix[i-1]*n[i];
        }

        suffix[n.length-1]=n[n.length-1];
        for(int i=n.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*n[i];
        }

        ans[0]=suffix[1];
        ans[n.length-1]=prefix[n.length-2];

        for(int i=1;i<=n.length-2;i++){
            ans[i]=prefix[i-1]*suffix[i+1];
        }
        return ans;
    }
}
