class Solution {
    public int lengthOfLastWord(String s) {
        String ab[] = s.split(" ");
        String ans = ab[ab.length-1];
        return ans.length();
    }
}