public class BestTimeBuyNSell2 {
    public int maxProfit(int[]prices){
        int profit =0;

        for(int i=0 ; i< prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                profit += prices[i+1]-prices[i];
            }
        }
        return profit ;
    }

    public static void main(String[] args) {

        //int[] prices = {7,1,5,3,6,4}; // example array 1#
        int[] prices = {1,2,3,4,5}; // example array 2#
        BestTimeBuyNSell2 b = new BestTimeBuyNSell2();
        System.out.println(b.maxProfit(prices));

    }
}
