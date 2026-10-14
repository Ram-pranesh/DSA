class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalBottles = numBottles ;
        int emptyBottles = numBottles ;

        while ( emptyBottles >= numExchange )  {
            emptyBottles -= numExchange ;
            totalBottles += 1 ;
            numBottles += 1;
            numExchange += 1 ;
            emptyBottles += 1;
        }
        return totalBottles;
    }
}