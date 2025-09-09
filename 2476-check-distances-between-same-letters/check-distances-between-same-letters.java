import java.util.*;

class Solution {
    public boolean checkDistances(String s, int[] distance) {
      HashMap<Character,Integer>hs=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!hs.containsKey(ch)){
            hs.put(ch,i);
        }
        else{
            int dist=i-hs.get(ch)-1;
            int exp=distance[ch-'a'];
            if(dist!=exp){
                return false;
            }

        }
      }
      return true;
    }
}