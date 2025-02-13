class Solution {
    public int minimumOperations(int[] nums) {
        int sol = 0;
        for(int num:nums){
            int rem = num%3;
            if(rem == 0){
                continue;
            }
            else{
                sol+=1;
            }
            // if(rem == 2 && num == 0){
            //     sol+=1;
            // }
            // if(rem == 1 || rem == 2){
            //     sol+=1;
            // }
            
        }
        return sol;
    }
}