class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans= numBottles;
        int curr=0;
        while (numBottles>=numExchange)
        {
            curr= (numBottles/numExchange);
            ans=ans+curr;
            numBottles=numBottles % numExchange + curr;
        }
        return ans;
    }
}