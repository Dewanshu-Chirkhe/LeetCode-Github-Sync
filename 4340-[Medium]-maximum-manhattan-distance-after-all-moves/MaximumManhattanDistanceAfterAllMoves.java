class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int count = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U') x++;
            else if(ch == 'D') x--;
            else if(ch == 'L') y--;
            else if(ch == 'R') y++;
            else if(ch == '_') count++;
        }

        int distance = Math.abs(x) + Math.abs(y);
        distance += count;
        
        return distance;
    }
}