import java.util.*;
class Solution {
    public boolean check(int[] arr) {
        int drop = 0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                drop++;
                if(drop>1)
                    return false;
            }
        }
        
        return true;
    }
}