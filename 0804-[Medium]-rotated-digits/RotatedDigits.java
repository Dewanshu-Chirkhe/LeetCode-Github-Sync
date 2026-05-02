class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        
        Set<Integer> change = new HashSet<>(Arrays.asList(2, 5, 6, 9));
        Set<Integer> invalid = new HashSet<>(Arrays.asList(3, 4, 7));

        for(int i = 1; i <= n; i++){
            int ele = i;
            boolean valid = true;
            boolean hasChange = false;

            while(ele > 0){
                int last = ele % 10;
                ele /= 10;

                if(invalid.contains(last)){
                    valid = false;
                    break;
                }

                if(change.contains(last)) hasChange = true;
            }

            if(valid && hasChange) count++;
        }

        return count;
    }
}