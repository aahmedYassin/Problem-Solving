class Solution {
    public boolean containsDuplicate(int[] nums) {
     // O(N^2)
     /* boolean checkCountAtLeasTwiceFlag=false;
        int countNumberAppears;
        for(int i=0;i<nums.length;i++){
           
            countNumberAppears=0;
            
            countNumberAppears++;
           
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]==nums[j])
                    countNumberAppears++;
                if(countNumberAppears==2){
                
                    checkCountAtLeasTwiceFlag=true;
                    
                    break;
                
                }
                    
            
            }
        
        
        }
        
        return checkCountAtLeasTwiceFlag;*/

        // O(N)
        Set<Integer>setUniqueNumbers=new HashSet<Integer>();
        boolean checkCountAtLeasTwiceFlag=true;
        for(int i=0;i<nums.length;i++){

             if(setUniqueNumbers.add(nums[i])){

                    checkCountAtLeasTwiceFlag=false;
               
                }

            else{

                checkCountAtLeasTwiceFlag=true;
                 break;
    
             }

        }

        return checkCountAtLeasTwiceFlag;
    }
}