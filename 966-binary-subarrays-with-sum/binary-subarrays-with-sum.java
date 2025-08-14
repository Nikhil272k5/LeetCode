class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        int current=0;
        int total=0;
        hs.put(0,1);
        for(int num:nums){
            current+=num;
            int req=current-goal;
            if(hs.containsKey(req)){
                total+=hs.get(req);
            }
            hs.put(current,hs.getOrDefault(current,0)+1);
        }
        return total;
    }
}