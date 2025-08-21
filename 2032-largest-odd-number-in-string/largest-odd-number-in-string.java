class Solution {
    public String largestOddNumber(String num) {
        // Traverse from rightmost digit to left
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            
            // check if digit is odd
            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        // No odd digit found
        return "";
    }
}
