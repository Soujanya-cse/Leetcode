class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();

        int count=0;
        
        for(int x:nums1){
           h.put(x,1);
        }

        for(int x:nums2){
           if(h.containsKey(x) && h.get(x)==1){
           h.put(x,2);
           count++;
           }
        }
        int[] a=new int[count];
        int i=0;
        for(int x:h.keySet()){
            if(h.get(x)==2){
                a[i]=x;
                i++;
            }
        }

        return a;
    }
}