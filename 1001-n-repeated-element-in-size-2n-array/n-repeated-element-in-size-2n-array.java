class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        
        for (int key : hs.keySet()) {
            if(hs.get(key)>1){
                return key;
            }
        }
        return -1;
    }
}