import java.util.*;
class Solution {
    int missingNum(int arr[]) {
        int len=arr.length;
        Arrays.sort(arr);
        if(arr[0] != 1){
            return 1;
        }
        else{
            
            
            for(int i=0;i<len-1;i++){
                int a=arr[i];
                if(arr[i+1]==a+1){
                    continue;
                }
                else return(a+1);
            }
        }return len+1;
    }
}