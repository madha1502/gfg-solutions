class Solution {
    public int scoreOfString(String s) {
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int val = (int)(c);
            arr[i] = val;
        }
        System.out.print(Arrays.toString(arr));
       int narr[] = new int[arr.length-1];
        int n = s.length();
        int i=1;
            int diff=0;
            for(int j=1;j<arr.length;j++){
                diff = Math.abs(arr[j]-arr[i-1]);
                narr[i-1] = diff;
                 i++;
            }
        int sum=0;
        for(int k=0;k<narr.length;k++){
            sum=sum+narr[k];
        }
        return sum;
    }
}