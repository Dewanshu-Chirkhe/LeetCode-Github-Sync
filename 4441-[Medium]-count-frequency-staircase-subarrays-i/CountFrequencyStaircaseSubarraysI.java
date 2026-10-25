class Solution {
    public int countStaircase(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i=0 ; i<n ; i++){
            Map<Integer, Integer> freq = new HashMap<>();
            List<Integer> order = new ArrayList<>();

            for(int j=i ; j<n ; j++){
                int num = nums[j];

                if(!freq.containsKey(num)){
                    freq.put(num, 0);
                    order.add(num);
                }

                freq.put(num, freq.get(num) + 1);

                boolean valid = true;

                for(int k=0 ; k<order.size() ; k++){
                    if(freq.get(order.get(k)) != k + 1){
                        valid = false;
                        break;
                    }
                }

                if(valid) ans++;
            }
        }

        return ans;
    }
}