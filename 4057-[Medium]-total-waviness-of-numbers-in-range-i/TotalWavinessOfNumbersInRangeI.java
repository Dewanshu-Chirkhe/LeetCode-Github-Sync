class Solution {
    public int findWaviness(int num){
        if(num < 100) return 0;
        List<Integer> list = new ArrayList<>();
        while(num > 0){
            list.add(num % 10);
            num /= 10;
        }
        
        int peak = 0;
        int valley = 0;
        for(int i=1 ; i<list.size()-1 ; i++){
            //peak
            if(list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1)) peak++;
            //valley
            if(list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1)) valley++;
        }

        return peak + valley;
    }
    public int totalWaviness(int num1, int num2){
        int ans = 0;

        for(int i=num1 ; i<=num2 ; i++){
            ans += findWaviness(i);
        }

        return ans;
    }
}