class Solution {
    public int compress(char[] chars) {
        int j=0;
        int count =1;

        for(int i=0; i< chars.length; i++){
            if(i==chars.length-1||chars[i]!=chars[i+1]){
                chars[j++]=chars[i];

                if(count> 1){
                    for(char c: Integer.toString(count).toCharArray()){
                        chars[j++]=c;
                    }
                }
                count = 1;
            }else{
                count++;
            }
        }
        return j;
    }
}