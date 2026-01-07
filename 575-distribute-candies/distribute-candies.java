class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int ans=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);  
        }
        ans=Math.min(hs.size(),n/2);
        return ans;
        
    }
}