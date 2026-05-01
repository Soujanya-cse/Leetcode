class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        
        if(a.length==1 && a[0]==1 && n>0){
            return false;
        }

        if(a.length==1 && a[0]==0 && n==1){
            return true;
        }

        if(a.length==1 && a[0]==0 && n==0){
            return true;
        }

        if(a.length==1 && n>0){
            return false;
        }
        
        if(n<0){
            return false;
        }
        
        
        if(a.length==2 && a[0]==0 && a[1]==0 && n==1){
            return true;
        }

        if(a.length==2 && a[a.length-1]==0 && a[a.length-2]==0 && n==1){
            return true;
        }

        for(int i=0;i<a.length;i++){
            if(i>=0 && i<=a.length-1 && i==0 && n>0 && a[1]==0 && a[0]==0){
                a[0]=1;
                n--;
            }

            else if(i==a.length-1 && a[a.length-1]==0 && a[a.length-2]==0 && n>0){
                a[a.length-1]=1;
                n--;
            }

             else if(i+1<=a.length-1 && i-1>=0 && a[i]==0 && a[i-1]==0 && a[i+1]==0 && n>0){
                a[i]=1;
                n--;
            }
           
        }
        if(n==0)
        return true;
        else
        return false;
    }
}