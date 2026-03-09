class Solution {
    int missingNum(int arr[]) {
        // code here
        int sum=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum^=arr[i];
        }
        for(int i=1;i<=arr.length+1;i++){
            sum2^=i;
        }
        return sum2^sum;
    }
}