class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        char ch[]=word.toCharArray();
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<word.length();i++){
          hs.add(ch[i]);
        }
        for(char c='a';c<='z';c++){
            if(hs.contains(c)&&hs.contains(Character.toUpperCase(c))){
            count++;
        }
            
        }
        return count;
    }
}