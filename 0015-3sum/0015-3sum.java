class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
         Set<List<Integer>> h = new HashSet<>();

         for(int i=0;i<=a.length-1;i++){
            int j=i+1;
            int k=a.length-1;

            while(j<k){
                if(a[i]+a[j]+a[k]==0){
                    List<Integer> t=new ArrayList<>();
                    t.add(a[i]);
                    t.add(a[j]);
                    t.add(a[k]);
                    h.add(t);
                    j++;
                k--;
                }
                
                else if(a[i]+a[j]+a[k]>0){
                k--;
            }
            else{
                j++;
            }
            }
            
         }

         return new ArrayList<>(h);
    }
}