class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        } 
        char[] ssort = s.toCharArray();
        char[] stort = t.toCharArray();
        Arrays.sort(ssort);
        Arrays.sort(stort);
        return Arrays.equals(ssort,stort);
    }
}
