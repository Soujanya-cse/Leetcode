class Solution {
    public int singleNumber(int[] a) {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int x:a){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }

        int ans=0;

        for(int x:h.keySet()){
            if(h.get(x)==1){
                ans=x;
            }
        }

        return ans;
    }
}