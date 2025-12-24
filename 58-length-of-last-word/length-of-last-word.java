class Solution {
    public int lengthOfLastWord(String s) {
         int endIndex = s.length() - 1;
      
        // Skip trailing spaces from the end
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }
      
        // Mark the end position of the last word
        int startIndex = endIndex;
      
        // Move backwards to find the start of the last word
        // Stop when we encounter a space or reach the beginning
        while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
            startIndex--;
        }
      
        // Calculate the length of the last word
        // startIndex points to the space before the word (or -1 if at beginning)
        // endIndex points to the last character of the word
        return endIndex - startIndex;
    }
}