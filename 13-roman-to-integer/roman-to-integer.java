class Solution {
    public int romanToInt(String s) {
    
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = map.get(s.charAt(0));
        for(int i= 1; i<s.length();i++){
            int num1 =  map.get(s.charAt(i));
            int num2 =  map.get(s.charAt(i-1));
            if(num1 > num2){
                sum -= num2;
                int num = num1-num2;
                sum += num;
            }
            else{
                sum += num1;
            }
        }

        return sum;
    }
}