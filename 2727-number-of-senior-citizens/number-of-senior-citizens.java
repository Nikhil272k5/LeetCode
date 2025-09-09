class Solution {
    public int countSeniors(String[] details) {
        int count=0;
   for(String st:details){
    String age1=st.substring(11,13);
    int age=Integer.parseInt(age1);
    if(age>60){
        count++;
    }
   
}
return count;
    }
}