class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                min = min + 1;
                max = max+1;
            }
            else if(c == ')'){
                min = min -1 ;
                max = max -1;
            }
            else{
                min = min-1;
                max = max+1;
            }
            if(min<0){
                min = 0;
            }
            if(max<0){
                return false;
            }
        }
        return min == 0?true:false;
    }
}

// class Solution {
//     public boolean func(int ind,String s,int n,int count){
//         if(count<0){
//             return false;
//         }
//         if(ind == n){
//             return count==0? true : false;
//         }
//         if(s.charAt(ind) == '('){
//             return func(ind+1,s,n,count+1);
//         }
//         else if(s.charAt(ind) == ')'){
//             return func(ind+1,s,n,count-1);
//         }
//         else{
//             return func(ind+1,s,n,count+1) || func(ind+1,s,n,count-1) 
//             || func(ind+1,s,n,count+0);
//         }
//     }
//     public boolean checkValidString(String s) {
//         return func(0,s,s.length(),0);
//     }
// }