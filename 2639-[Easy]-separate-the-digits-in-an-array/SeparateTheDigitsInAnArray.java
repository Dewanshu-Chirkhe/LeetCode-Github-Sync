class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int ele : nums){
            if(ele >= 10){
                Stack<Integer> st = new Stack<>();
                while(ele > 0){
                    int last = ele % 10;
                    ele /= 10;
                    st.push(last);
                }
                while(!st.isEmpty()){
                    list.add(st.pop());
                }
            }
            else list.add(ele);
        }

        int n = list.size();
        int[] ans = new int[n];

        for(int i=0 ; i<n ; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}