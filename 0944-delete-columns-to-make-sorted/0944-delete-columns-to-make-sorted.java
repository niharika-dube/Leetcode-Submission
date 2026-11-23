class Solution {
    public int minDeletionSize(String[] strs) {
        int deleteCount =0;
        int numsRows= strs.length;
        int numsCols=strs[0].length();

        for(int col=0; col< numsCols; col++){
            for(int row=0; row < numsRows-1; row++){
                if(strs[row].charAt(col)>strs[row+1].charAt(col)){
                    deleteCount++;
                    break;
                }
            }
        }
        return deleteCount;
    }  
}