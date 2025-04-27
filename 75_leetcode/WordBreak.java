class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<Integer, Boolean> memo = new HashMap<>();
        return solve(0, s, wordDict, memo);
    }

    public boolean solve(int start, String s, List<String> wordDict, HashMap<Integer, Boolean> memo){
        if(start == s.length())
            return true;
        
        if(memo.containsKey(start))
            return memo.get(start);
        for(String word : wordDict){
            int end = start+word.length();

            if(end <= s.length() && s.substring(start, end).equals(word)){
                if(solve(end, s, wordDict, memo)){
                    memo.put(end, true);
                    return true;
                }
            }
        }
        memo.put(start, false);
        return false;
    }
}
