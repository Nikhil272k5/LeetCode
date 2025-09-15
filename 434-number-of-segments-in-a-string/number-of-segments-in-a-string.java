class Solution {
    public int countSegments(String s) {
        String[] parts = s.trim().split("\\s+");
        if (s.trim().isEmpty()) return 0;  
        return parts.length;
    }
}