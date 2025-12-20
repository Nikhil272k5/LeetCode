class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if((strs[j].charAt(i)-'a')<(strs[j-1].charAt(i)-'a')){
                count++;
                break;

            }
        


        }

        
    }
    return count;
}
}