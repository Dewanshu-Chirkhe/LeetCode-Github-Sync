class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int[] reserved : reservedSeats) {
            int row = reserved[0];
            int seat = reserved[1];

            map.putIfAbsent(row, new int[11]);
            map.get(row)[seat] = 1;
        }

        int ans = (n - map.size()) * 2;

        for (int[] row : map.values()) {
            boolean left = true;    // 2,3,4,5
            boolean middle = true;  // 4,5,6,7
            boolean right = true;   // 6,7,8,9

            for(int i=2 ; i<=5 ; i++){
                if(row[i] == 1) left = false;
            }

            for(int i=4 ; i<=7 ; i++){
                if(row[i] == 1) middle = false;
            }

            for(int i=6 ; i<=9 ; i++){
                if(row[i] == 1) right = false;
            }

            if(left && right) ans += 2;
            else if(left || middle || right) ans++;
        }

        return ans;
    }
}