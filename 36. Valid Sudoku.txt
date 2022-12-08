class Solution {
    public boolean isValidSudoku(char[][] board) {
          
   
 	if(divideArrayRowsAndColumns(board)==false&&divideArrayToSubBoxes(board)==false)   
        	
		return true;  
    	else
        	return false;  
   
    }

     public static boolean checkDuplicateValueInRowAndColumn(char numbers[]){
    
        boolean checkDeplicateFlag=false;
        
        for(int i=0;i<9;i++){
        
            for(int j=i+1;j<9;j++){
            
                if((int)numbers[i]==(int)numbers[j]&&(int)numbers[i]>=49&&(int)numbers[i]<=57){
                
                    checkDeplicateFlag=true;
                    break;
                }
                       
            }
               
        }
        
        return checkDeplicateFlag;
    }
    
    public static boolean divideArrayRowsAndColumns(char board[][]){
    
       char row[]=new char[9];
       
       char column[]=new char[9];
       
       boolean checkRowAndColumDeplicateFlag=false;
             
       int index=0;
       
       for(int i=0;i<9;i++){
       
           for(int j=0;j<9;j++){
           
               row[index]=board[i][j];
               
               column[index]=board[j][i];
               
               index++;
           
           }
           if(checkDuplicateValueInRowAndColumn(row)||checkDuplicateValueInRowAndColumn(column)){
           
               checkRowAndColumDeplicateFlag=true;
               break;
           
           }
               
           index=0;
           
       }
       
       return checkRowAndColumDeplicateFlag;
      
    }
     public static boolean  checkDuplicateValueInSubBoxes(char numbers[][]){
            
            char row[]=new char[9];
            
            int index=0;
            
            boolean checkDeplicateFlag=false;
            
            for(int i=0;i<3;i++){
            
                for(int j=0;j<3;j++){
                
                    row[index]=numbers[i][j];
                        
                    index++;
                
                }
                      
            }
            
            checkDeplicateFlag=checkDuplicateValueInRowAndColumn(row);

            return checkDeplicateFlag;         
            
        }
     
       public static boolean divideArrayToSubBoxes(char board[][]){

            boolean checkSubBoxDeplicateFlag=false;
            
            char subBox[][]=new char [3][3];
            
            int row=0,column=0;
            
            for(int i=0;i<9;i++){
            
                for(int j=0;j<9;j++){
                
                    if((i==0&&j==0)||(i==0&&j==3)||(i==0&&j==6)||(i==3&&j==0)||(i==3&&j==3)||(i==3&&j==6)||(i==6&&j==0)||(i==6&&j==3)||(i==6&&j==6)){
                    
                            for(int k=i;k<i+3;k++){
                            
                                for(int l=j;l<j+3;l++){
                                
                                    subBox[row][column]=board[k][l];
                                    
                                     column++;
                                
                                }
                                
                                row++;
                                column=0;                          
                            
                            }
                            row=0;
                            column=0;
                    
                    }
                    
                    checkSubBoxDeplicateFlag=checkDuplicateValueInSubBoxes(subBox);
                   
                    if(checkSubBoxDeplicateFlag){
                                            
                        return checkSubBoxDeplicateFlag;
                    
                    }
                               
                }
                       
            }

           return checkSubBoxDeplicateFlag;

       }

      
}