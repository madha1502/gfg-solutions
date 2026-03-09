class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = 0;
        int max2 = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        return max2;
    }
}