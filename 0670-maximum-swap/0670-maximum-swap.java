class Solution {
    public int maximumSwap(int num) {
        char[] arr = (Integer.toString(num)).toCharArray();
        int maxIndex = -1,x=-1,y=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(maxIndex == -1 || arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
            else if(arr[i]<arr[maxIndex]){
                x = maxIndex;
                y = i;
            }
        }
        if(x!=-1 && y!=-1){
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return Integer.parseInt(new String(arr));
    }
}