class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> freq = new HashMap();
        Map<Integer,Integer> firstIndx = new HashMap();
        int n = nums.length;
        int maxFreq = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            firstIndx.putIfAbsent(nums[i],i);
            if(freq.get(nums[i])>maxFreq){
                maxFreq = freq.get(nums[i]);
                minLen = i-firstIndx.get(nums[i])+1;
            }
            if(freq.get(nums[i]) == maxFreq){
                minLen = Math.min(minLen,i-firstIndx.get(nums[i])+1);
            }
        }
        return minLen;

    }
}