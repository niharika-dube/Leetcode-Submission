class Solution {
    public boolean checkIfPangram(String sentence) {
       int count =0;
       boolean[]arr=new boolean[26];

       for(int i=0;i<sentence.length();i++){
        char ch=sentence.charAt(i);
        int index=ch-'a';

        if(arr[index]==false){
            arr[index]=true;
            count++;
        }
     }
       return count ==26;
   }
}
