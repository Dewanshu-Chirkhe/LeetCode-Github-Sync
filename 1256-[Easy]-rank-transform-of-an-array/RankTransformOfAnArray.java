class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for(int ele : temp){
            if(map.containsKey(ele)) continue;
            else{
                map.put(ele, rank);
                rank++;
            }
        }
        
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++){
            int ele = arr[i];
            ans[i] = map.get(ele);
        }

        return ans;
    }
}