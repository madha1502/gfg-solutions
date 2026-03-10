class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int narr[] = new int[n];
        int max = -1;
        for(int i=n-1;i>=0;i--){
            narr[i] = max;
            max=Math.max(arr[i],max);
        }
        return narr;
    }
}