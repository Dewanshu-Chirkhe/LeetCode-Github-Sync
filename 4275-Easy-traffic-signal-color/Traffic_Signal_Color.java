class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0) return new String("Green");
        else if(timer == 30) return new String("Orange");
        else if(timer > 30 && timer <= 90) return new String("Red");
        else return new String("Invalid");
    }
}