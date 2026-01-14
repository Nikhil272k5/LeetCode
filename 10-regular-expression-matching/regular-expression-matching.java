class Solution {

    public boolean solve(String s, String p){

        // 1. If pattern is empty
        if(p.length() == 0){
            return (s.length() == 0);
        }

        // 2. Check 1st character match
        boolean isFirstMatch = false;
        if(s.length() > 0 && 
           (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')){
            isFirstMatch = true;
        }

        // 3. Check if next char exists AND is '*'
        if(p.length() > 1 && p.charAt(1) == '*'){

            // NOT TAKE → remove x*
            boolean notTake = solve(s , p.substring(2));

            // TAKE → only if first matches
            boolean take = isFirstMatch && solve(s.substring(1) , p);  

            return notTake || take;

        }else{
            // normal move
            return isFirstMatch && s.length() > 0 
                   && solve(s.substring(1) , p.substring(1));
        }
    }

    public boolean isMatch(String s, String p) {
       return solve(s, p);
    }
}