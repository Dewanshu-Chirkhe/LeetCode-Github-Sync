class BusBooking {
    private boolean[][] booked;
    private int[][] cost;
    private int totalTime = 0;
    private int minTime = 0;

    
    public BusBooking(int n) {
        booked = new boolean[n][4];
        cost = new int[n][4];
    }
    
    public void toggle(String seat) {
        char col = seat.charAt(0);
        int row = Integer.parseInt(seat.substring(1)) - 1;
        int c = col - 'A';

        if(booked[row][c]){
            totalTime -= cost[row][c];
            minTime--;
            
            booked[row][c] = false;
            cost[row][c] = 0;
        }
        else{
            booked[row][c] = true;

            int seatCost;
            
            if(c == 1 || c == 2) seatCost = 1;
            else if(c == 0){
                seatCost = booked[row][1] ? 3 : 1;
            }
            else{
                seatCost = booked[row][2] ? 3 : 1;
            }

            cost[row][c] = seatCost;
            totalTime += seatCost;
            minTime++;
        }
    }
    
    public int getTotalTime() {
        return totalTime;
    }
    
    public int getMinTime() {
        return minTime;
    }
}