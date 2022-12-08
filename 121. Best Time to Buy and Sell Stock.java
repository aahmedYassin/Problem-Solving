class Solution {
    //O(N^2)
    /*
    public int maxProfit(int[] prices) {
        
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
        
            for(int j=i+1;j<prices.length;j++){
            
                if(prices[j]-prices[i]>0){
                
                    if(maxProfit<prices[j]-prices[i]){
                    
                        maxProfit=prices[j]-prices[i];
                    
                    }
                
                }
            
            }
        
        }
        
        return maxProfit;
    }
    */

    /*
     public int maxProfit(int[] prices) {

        int maxProfit=0,value;
        for(int i=0;i<prices.length;i++){
        
            value=maxValue(prices,i);
            
            if(value>maxProfit)
                maxProfit=value;
        
        
        }

        return maxProfit;

     }
       public static int maxValue(int arr[],int i){
     
            int max=0;
                       
            for(int j=i+1;j<arr.length;j++){
                  
                if(arr[j]-arr[i]>0){
                
                    if(arr[j]-arr[i]>max)
                       max=arr[j]-arr[i];
                
                }
                                 
            }
          
            return max;
     }
    */
    public int maxProfit(int[] prices) {

      int maxProfit=0;
      int currentDayPrice=prices[0];
      
      for(int i=1;i<prices.length;i++){
      
          if(prices[i]<currentDayPrice)
              currentDayPrice=prices[i];
          
           if(prices[i]-currentDayPrice>maxProfit)
               maxProfit=prices[i]-currentDayPrice;
      
      
      }
      return maxProfit;
}
}