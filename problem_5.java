class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
       int narr[] = new int[n+n];
       int i=0;
       int j=0;
       while(j<(n+n)){
        narr[j]=nums[i];
        i++;
        j++;
        if(i>=n){
            i=0;
        }
       }
       return narr; 
    }
}