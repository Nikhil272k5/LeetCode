class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int t : nums) {
      list.add(t);
        }
        int l=0;
        int r=list.size()-1;
        while(l<=r){
            if(list.get(l)==val){
                list.remove(l);
                r--;
            }
            else if(list.get(r)==val){
                list.remove(r);
                r--;
            }
            else{
                l++;
                r--;
            }

        }
      for(int i=0;i<list.size();i++){
        nums[i]=list.get(i);
      }
        return list.size();
    }
}