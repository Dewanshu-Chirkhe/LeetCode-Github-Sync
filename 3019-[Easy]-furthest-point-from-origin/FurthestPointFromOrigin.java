class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : moves.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
 
        int freqL = map.getOrDefault('L', 0);
        int freqR = map.getOrDefault('R', 0);
        char replacement = (freqL > freqR) ? 'L' : 'R';

        String newMoves = moves.replace('_', replacement);

        int dist = 0;
        for(char ch : newMoves.toCharArray()){
            if(ch == 'L') dist++;
            else dist--;
        }

        return Math.abs(dist);
    }
}